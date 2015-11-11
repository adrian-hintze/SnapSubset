/* 
 *  
 * PragmaParser.java
 *  
 * written by Adrian Hintze
 *  
 * Copyright (c) 2015 by Adrian Hintze
 * 
 * This file is a part of Snapp!
 * 
 * Snapp! is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */


package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataStructures.ClassInfo;
import dataStructures.ClassParents;
import dataStructures.GlobalInfo;


public class PragmaParser {
	
	/* private attributes */
	
	private GlobalInfo globalInfo = GlobalInfo.getInstance();
	private Boolean isVar;
	private Boolean isPassthrough;
	
	
	/* public methods */
	
	public void parsePragma(String pragma) {
		String editedPragma = pragma.substring(3, pragma.length() - 3);
		editedPragma = editedPragma.replaceAll("\\s+","");
		ClassInfo result = parsePragmaAux(editedPragma);	
		if (isPassthrough) GlobalInfo.getInstance().setPasstrough(true);
		else if (isVar) globalInfo.getDocumentSymbols().put(result.getName(), result);
		else globalInfo.getClasses().put(result.getName(), result);
	}
	
	public void parseLocalPragma(String pragma) {
		String editedPragma = pragma.substring(3, pragma.length() - 3);
		editedPragma = editedPragma.replaceAll("\\s+","");
		ClassInfo result = parsePragmaAux(editedPragma);
		if (isVar) {
			globalInfo.getLocalVars().put(result.getName(), result);
		}
		else {
			globalInfo.setNextFunc(result);
		}
	}
	
	
	/* private methods */
	
	private ClassInfo parsePragmaAux(String pragma) {
		String editedPragma = pragma.substring(1, pragma.length() - 1);
		Map<String, String> fields = parse(editedPragma);	
		ClassInfo result = new ClassInfo();
		for (String key : fields.keySet()) {
			doStuff(result, key, fields);
		}	
		isVar = fields.containsKey("var");
		isPassthrough = fields.containsKey("passthrough");
		return result;	
	}
	
	private void doStuff(ClassInfo ci, String field, Map<String, String> fields) {
		switch (field) {
			case "name" :
				ci.setName(fields.get(field));
				break;
			case "class" :
				String codeC = fields.get("class");
				if (!codeC.contains(",") && !codeC.contains("{")) {
					ci.setParentClasses(new ClassParents(codeC));
				}
				else {
					ClassParents parentClasses = new ClassParents();
					String[] working = null;
					String auxCode = codeC;
					do {
						if (auxCode.startsWith("{")) {
							working = manualSplit(auxCode);
							ClassInfo aux = parsePragmaAux(working[0]);
							ci.addProperties(aux.getProperties());
							parentClasses.addParents(aux.getParentClasses());
							auxCode = working[1];
						}
						else {
							working = auxCode.split(",", 2);
							if (working.length > 1) auxCode = working[1];
							else auxCode = "";
							parentClasses.addParent(working[0]);
						}
						
					} while (working.length > 1 && !working[1].equals(""));
					ci.setParentClasses(parentClasses);
				}
				if (ci.getParentClasses() != null) {
					for (String s : ci.getParentClasses().getAllParents()) {
						if (s.equals("Function")) {
							String code = fields.get("return");
							ClassInfo ret = null;
							//this way we don't need to write return type everytime if there's none
							if (code == null) {
								code = "Void";
							}						
							if (!code.contains(",") && !code.contains("{")) {
								ret = new ClassInfo("()", new ClassParents(code));
							}
							else {
								ClassParents parentClasses = new ClassParents();
								String[] working = null;
								String auxCode = code;
								ClassInfo retTemp = new ClassInfo();
								do {
									if (auxCode.startsWith("{")) {
										working = manualSplit(auxCode);
										ClassInfo aux = parsePragmaAux(working[0]);
										retTemp.addProperties(aux.getProperties());
										parentClasses.addParents(aux.getParentClasses());
										auxCode = working[1];
									}
									else {
										working = auxCode.split(",", 2);
										if (working.length > 1) auxCode = working[1];
										else auxCode = "";
										parentClasses.addParent(working[0]);
									}
									
								} while (working.length > 1 && !working[1].equals(""));
								ret = new ClassInfo("()", parentClasses);
								ret.addProperties(retTemp.getProperties());
							}
							
							List<String> parentClass = new ArrayList<String>();
							parentClass.add("Function");
							ci.getProperties().addProperty(new ClassInfo("call", parentClass, Arrays.asList(new ClassInfo[]{ret})));
							ci.getProperties().addProperty(new ClassInfo("apply", parentClass, Arrays.asList(new ClassInfo[]{ret})));
							ci.getProperties().addProperty(ret);
						}
						else if (s.equals("Array")) {
							String code = fields.get("type");
							if (code != null) {
								ClassInfo type = null;
								if (!code.contains(",") && !code.contains("{")) {
									type = new ClassInfo("[]", new ClassParents(code));
								}
								else {
									ClassParents parentClasses = new ClassParents();
									String[] working = null;
									String auxCode = code;
									ClassInfo retTemp = new ClassInfo();
									do {
										if (auxCode.startsWith("{")) {
											working = manualSplit(auxCode);
											ClassInfo aux = parsePragmaAux(working[0]);
											retTemp.addProperties(aux.getProperties());
											parentClasses.addParents(aux.getParentClasses());
											auxCode = working[1];
										}
										else {
											working = auxCode.split(",", 2);
											if (working.length > 1) auxCode = working[1];
											else auxCode = "";
											parentClasses.addParent(working[0]);
										}
										
									} while (working.length > 1 && !working[1].equals(""));
									type = new ClassInfo("[]", parentClasses);
									type.addProperties(retTemp.getProperties());
								}	
								ci.getProperties().addProperty(type);
							}
						}
					}
				}
				break;
			case "properties" :
				List<ClassInfo> attrs = new ArrayList<ClassInfo>();
				String[] parts = manualSplit(fields.get(field));
				while (true) {
					attrs.add(parsePragmaAux(parts[0]));
					if (parts[1].equals("")) break;
					parts[1] = parts[1];
					parts = manualSplit(parts[1].substring(0, parts[1].length()));
				}
				ci.getProperties().addProperties(attrs);
				break;
			case "parameters" :
				List<ClassInfo> attrsP = new ArrayList<ClassInfo>();
				String[] partsP = manualSplit(fields.get(field));
				while (true) {
					attrsP.add(parsePragmaAux(partsP[0]));
					if (partsP[1].equals("")) break;
					partsP[1] = partsP[1];
					partsP = manualSplit(partsP[1].substring(0, partsP[1].length()));
				}
				ci.getParameters().addAll(attrsP);
				break;
		}
	}
	
	private Map<String, String> parse(String pragma) {
		Map<String, String> result = new HashMap<String, String>();
		String before = pragma;
		String[] parts = pragma.split(",", 2);
		while(parts.length >= 1) {
			String aux = parts[0];
			if (aux.startsWith("properties")) {
				Integer i = before.indexOf("{");
				before = before.substring(i, before.length());
				parts = manualSplit(before);
				parts[0] = parts[0].substring(1, parts[0].length() - 1);
				parts[0] = parts[0];
				result.put("properties", parts[0]);
			}
			else if (aux.startsWith("parameters")) {
				Integer i = before.indexOf("{");
				before = before.substring(i, before.length());
				parts = manualSplit(before);
				parts[0] = parts[0].substring(1, parts[0].length() - 1);
				parts[0] = parts[0];
				result.put("parameters", parts[0]);
			}
			else if (aux.startsWith("var")) {
				result.put(aux, "");
			}
			else if (aux.startsWith("passthrough")) {
				result.put(aux, "");
			}
			else if (aux.startsWith("type")) {
				if (aux.charAt(5) == '{') {
					Integer i = before.indexOf("{");
					before = before.substring(i, before.length());
					parts = manualSplit(before);
					parts[0] = parts[0].substring(1, parts[0].length() - 1);
					parts[0] = parts[0];
					result.put("type", parts[0]);
				}
				else {
					String[] auxParts = aux.split(":");
					if (auxParts.length != 1) result.put(auxParts[0], auxParts[1]);
				}
			}
			else if (aux.startsWith("return")) {
				if (aux.length() > 6 && aux.charAt(7) == '{') {
					Integer i = before.indexOf("{");
					before = before.substring(i, before.length());
					parts = manualSplit(before);
					parts[0] = parts[0].substring(1, parts[0].length() - 1);
					parts[0] = parts[0];
					result.put("return", parts[0]);
				}
				else {
					String[] auxParts = aux.split(":");
					if (auxParts.length != 1) result.put(auxParts[0], auxParts[1]);
				}
			}
			else if (aux.startsWith("class")) {
				if (aux.length() > 5 && aux.charAt(6) == '{') {
					Integer i = before.indexOf("{");
					before = before.substring(i, before.length());
					parts = manualSplit(before);
					parts[0] = parts[0].substring(1, parts[0].length() - 1);
					parts[0] = parts[0];
					result.put("class", parts[0]);
				}
				else {
					String[] auxParts = aux.split(":");
					if (auxParts.length != 1) result.put(auxParts[0], auxParts[1]);
				}
			}
			else {
				String[] auxParts = aux.split(":");
				if (auxParts.length != 1) result.put(auxParts[0], auxParts[1]);
			}
			if (parts.length == 1) break;
			before = parts[1];
			parts = parts[1].split(",", 2);
		}
		return result;
	}
	
	
	//separates one {} encased block (starting from the beginning) from the rest of the string
	private String[] manualSplit(String s) {
		Integer count = 1;
		Integer pos = 1;
		//System.out.println(s);
		while (count != 0) {
			if (s.charAt(pos) == '{') ++count;
			else if (s.charAt(pos) == '}') --count;
			++pos;
		}
		String[] result = new String[2];
		result[0] = s.substring(0, pos);
		if (!pos.equals(s.length())) ++pos;
		result[1] =  s.substring(pos, s.length());
		return result;
	}
	
}
