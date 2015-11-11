/* 
 *  
 * ClassInfo.java
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

package dataStructures;

import java.util.ArrayList;
import java.util.List;

import utils.Logger;


public class ClassInfo {

	/* private attributes */
	
	private ClassProperties properties;
	private ClassParents parentClasses;
	private List<ClassInfo> parameters;
	private String name;

	
	/* constructors */
	
	public ClassInfo() {
		this.properties = new ClassProperties();
		this.parameters = new ArrayList<ClassInfo>();
		this.parentClasses = new ClassParents();
	}
	
	public ClassInfo(ClassInfo ci) {
		if (ci.getName() != null) this.name = new String(ci.getName());
		this.parentClasses = new ClassParents(ci.getParentClasses());
		this.properties = new ClassProperties(ci.getProperties());
		this.parameters = new ArrayList<ClassInfo>(ci.getParameters());
	}
	
	public ClassInfo(String name) {
		this.name = name;
		this.properties = new ClassProperties();
		this.parameters = new ArrayList<ClassInfo>();
		this.parentClasses = new ClassParents();
	}
	
	public ClassInfo(String name, ClassParents parentClasses) {
		this.name = name;
		
		this.parentClasses = new ClassParents();
		this.parentClasses.addParents(parentClasses);
		
		this.parameters = new ArrayList<ClassInfo>();
		this.properties = new ClassProperties();
	}
	
	public ClassInfo(String name, ClassParents parentClasses, ClassProperties properties) {
		this.name = name;
		
		this.parentClasses = new ClassParents();
		this.parentClasses.addParents(parentClasses);
		
		this.properties = new ClassProperties();
		this.properties.addProperties(properties);
		
		this.parameters = new ArrayList<ClassInfo>();
	}
	
	public ClassInfo(String name, ClassParents parentClasses, List<ClassInfo> properties) {
		this.name = name;
		
		this.parentClasses = new ClassParents();
		this.parentClasses.addParents(parentClasses);
		
		this.properties = new ClassProperties();
		this.properties.addProperties(properties);
		
		this.parameters = new ArrayList<ClassInfo>();
	}
	
	public ClassInfo(String name, List<String> parentClasses, ClassProperties properties) {
		this.name = name;
		
		this.parentClasses = new ClassParents();
		this.parentClasses.addParents(parentClasses);
		
		this.properties = new ClassProperties();
		this.properties.addProperties(properties);
		
		this.parameters = new ArrayList<ClassInfo>();
	}
	
	public ClassInfo(String name, List<String> parentClasses, List<ClassInfo> properties) {
		this.name = name;
		
		this.parentClasses = new ClassParents();
		this.parentClasses.addParents(parentClasses);
		
		this.properties = new ClassProperties();
		this.properties.addProperties(properties);
		
		this.parameters = new ArrayList<ClassInfo>();
	}
	
	
	/* public methods */
	
	public Boolean hasProperties() {
		return !properties.isEmpty();
	}
	
	public void addProperty(ClassInfo ci) {
		properties.addProperty(ci);
	}
	
	public void addProperties(ClassProperties cp) {
		properties.addProperties(cp);
	}
	
	public void addParentClass(String parent) {
		parentClasses.addParent(parent);
	}
	
	public void addParentClasses(ClassParents cp) {
		parentClasses.addParents(cp);
	}
	
	public ClassInfo getPropertyExcludeParents(String id) {
		return properties.getProperty(id);
	}
	
	public ClassInfo getProperty(String id) {
		ClassInfo result = properties.getProperty(id);
		if (result != null) return result;
		if (parentClasses != null) {
			for (String parentClass : parentClasses.getAllParents()) {
				ClassInfo ci = GlobalInfo.getInstance().getClasses().get(parentClass);
				if (ci != null) {
					ClassInfo property = ci.getProperty(id);
					if (property != null) return property;
				}
			}
		}
		return null;
	}
	
	public Boolean hasParent(String parent) {
		return parentClasses.containsParent(parent);
	}
	
	public ClassInfo getParameter(String name) {
		for (ClassInfo ci : this.parameters) if (ci.getName().equals(name)) return ci;
		return null;
	}
	
	public void printMe() {
		this.printMe(0);
	}
	
	
	/* private methods */
	
	private void printMe(Integer indent) {
		String indentation = Logger.getIndentation(indent);
		Logger.forceToTalk(indentation + "name: " + this.name);
		if (!this.parentClasses.isEmpty()) {
			Logger.forceToTalk(indentation + this.parentClasses.size() + " parentClasses:");
			for (String s : this.parentClasses.getAllParents()) Logger.forceToTalk(Logger.getIndentation(indent + 1) + s);
		}
		if (!this.properties.isEmpty()) {
			Logger.forceToTalk(indentation + this.properties.size() + " properties:");
			for (ClassInfo ci : this.properties.getAllProperties()) {
				Logger.forceToTalk(indentation + "\t" + " property:");
				ci.printMe(indent + 2);
			}
		}
		if (!this.parameters.isEmpty()) {
			Logger.forceToTalk(indentation + this.parameters.size() + " parameters:");
			for (ClassInfo ci : this.parameters) ci.printMe(indent + 1);
		}
	}
	
	
	/* set & get */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(ClassProperties properties) {
		this.properties = properties;
	}
	
	public ClassProperties getProperties() {
		return properties;
	}
	
	public ClassParents getParentClasses() {
		return parentClasses;
	}

	public void setParentClasses(ClassParents parentClasses) {
		this.parentClasses = parentClasses;
	}
	
	public List<ClassInfo> getParameters() {
		return parameters;
	}

	public void setParameters(List<ClassInfo> parameters) {
		this.parameters = parameters;
	}
	
}
