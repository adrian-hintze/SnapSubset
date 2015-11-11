/* 
 *  
 * SnappExecutionEnvironmentGenerator.java
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

package main;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.listeners.WalkListener;
import parser.walkers.SnapTreeWalker;
import dataStructures.GlobalInfo;
import utils.Logger;
import antlr4.SnapGrammarLexer;
import antlr4.SnapGrammarListener;
import antlr4.SnapGrammarParser;
import antlr4.SnapGrammarParser.Jsnap_codeContext;


public class SnapSubset {
	
	/* private attributes */
	
	final static private String SEPARATOR = File.separator;	
	final static private Charset ENCODING = StandardCharsets.UTF_8;
	
	final static private String GUI = "gui.js";
	
	final static private String COPTER = "copter.xml";
	final static private String ANIMAL = "animalGame.xml";
	final static private String TREE = "tree.xml";
	final static private String VEE = "vee.xml";
	final static private String CHANGE = "change.xml";
	
	static private String infoFolder = "";
	static private String resultFolder = "";
	static private String snapFolder = "";
	static private String exampleProjectsFolder = "";
	static private String entryPoint = "";
	
	
	/* private methods */
	
	private static void initFilePaths() {
		String executionFolder = System.getProperty("user.dir");
		infoFolder = executionFolder + SEPARATOR + "working" + SEPARATOR + "info";
		resultFolder = executionFolder + SEPARATOR + "working" + SEPARATOR + "result";
		snapFolder = executionFolder + SEPARATOR + "working" + SEPARATOR + "Snap";
		exampleProjectsFolder = executionFolder + SEPARATOR + "working" + SEPARATOR + "exampleProjects";
		entryPoint = executionFolder + SEPARATOR + "working" + SEPARATOR + "gui" + SEPARATOR + "entryPoint.js";
	}
	
	private static void initFilePathsDebug() {
		infoFolder = "C:\\Users\\Rydion\\Desktop\\SnapRefactorIO\\working\\info";
		resultFolder = "C:\\Users\\Rydion\\Desktop\\SnapRefactorIO\\working\\result";
		snapFolder = "C:\\Users\\Rydion\\Desktop\\SnapRefactorIO\\working\\Snap";
		exampleProjectsFolder = "C:\\Users\\Rydion\\Desktop\\SnapRefactorIO\\working\\exampleProjects\\";
		entryPoint = "C:\\Users\\Rydion\\Desktop\\SnapRefactorIO\\working\\gui\\entryPoint.js";
	}
	
	private static void analyze(String code) {
		// lexer
		SnapGrammarLexer lexer = new SnapGrammarLexer(new ANTLRInputStream(code));
	 
		// tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	 
		// parser
		SnapGrammarParser parser = new SnapGrammarParser(tokens);
	 
		// entry point
		Jsnap_codeContext context = parser.jsnap_code();
		
		// walk the tree
		SnapTreeWalker walker = new SnapTreeWalker();
		SnapGrammarListener listener = new WalkListener();
		walker.walk(listener, context);
	}
	
	
	/* public methods */
	
	public static void main(String[] args) {

		initFilePaths();
		
		Boolean onlyModify = true;
		Boolean onlyAddProject = false;
		String exampleProject = "change.xml"; //VEE, ANIMAL, TREE, COPTER, CHANGE
		
		Path filePathProject = null;
		if (args.length > 0) {
			for (int i = 0; i < args.length; ++i) {
				switch(args[i]) {
					case "verbose":
						Logger.setSilent(false);
						break;
					case "DEBUG":
						initFilePathsDebug();
						break;
					case "add_project":
						onlyAddProject = true;
						onlyModify = false;
						break;
					case "example_project":
						exampleProject = args[i + 1];
						break;
				}
			}
		}
		
		
		String project = "";
		if (!onlyModify) {
			//if there's no project just use one of our samples
			if (filePathProject == null) {
				switch(exampleProject) {
					case "COPTER":
						filePathProject = Paths.get(exampleProjectsFolder + SEPARATOR + COPTER);
						break;
					case "CHANGE":
						filePathProject = Paths.get(exampleProjectsFolder + SEPARATOR + CHANGE);
						break;
					case "VEE":
						filePathProject = Paths.get(exampleProjectsFolder + SEPARATOR + VEE);
						break;
					case "ANIMAL":
						filePathProject = Paths.get(exampleProjectsFolder + SEPARATOR + ANIMAL);
						break;
					case "TREE":
						filePathProject = Paths.get(exampleProjectsFolder + SEPARATOR + TREE);
						break;
					default:
						filePathProject = Paths.get(exampleProjectsFolder + SEPARATOR + CHANGE);
				}
			}
			
			//load the contents of the project file
			List<String> sampleProject = null;
		    try {
				sampleProject = Files.readAllLines(filePathProject, ENCODING);
			} 
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
		    if (sampleProject.size() > 1) {
		    	try {
					throw new Exception("the project file should only have one line");
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
		    }
		    project = sampleProject.get(0);
			project = "IDE_Morph.prototype.snapproject = '" + project + "';";
		}
		
		
		if (onlyAddProject) {
			Path guiPath = Paths.get(resultFolder + SEPARATOR + GUI);
			List<String> fileClasses = null;
		    try {
				fileClasses = Files.readAllLines(guiPath, ENCODING);
			} 
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
		    
		    List<String> result = new ArrayList<String>();
		    for (String line : fileClasses) {
		    	result.add(line);
		    }
			
		    try {
				result.add(project + "\n");
				Files.write(guiPath, result, ENCODING);
			} 
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
		    
			System.out.println("Done");
		    System.exit(0);
		}
		
		HashMap<String, Boolean> files = new HashMap<String, Boolean>();
		
		/*walk all info files and populate the data structures with their metadata*/
		/*after that, refactor all Snap! files that have a corresponding info file*/
		/*if an info file declares itself as passthrough we just copy the entire original file*/
		try {
			Files.walk(Paths.get(infoFolder)).forEach (
				filePath -> {
					if (Files.isRegularFile(filePath)) {
						Logger.forceToTalk(filePath);
						try {
							List<String> lines = Files.readAllLines(filePath, ENCODING);
							String code = "";
						    for (String line : lines) {
						    	code += line + "\n";
						    }
						    analyze(code);
						} catch (Exception e) {
							e.printStackTrace();
						}
						finally {
							String fileName = filePath.getFileName().toString().split("\\.")[0] + ".js";
							Boolean passthrough = GlobalInfo.getInstance().getPasstrough();
							if (!fileName.equals("system.js")) {
								files.put(fileName, passthrough);
							}
							GlobalInfo.getInstance().setPasstrough(false);
						}
					}
				}
			);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String fileName : files.keySet()) {
			Path filePath = Paths.get(snapFolder + SEPARATOR + fileName);
			List<String> fileClasses = null;
		    try {
				fileClasses = Files.readAllLines(filePath, ENCODING);
			} 
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
		    
		    String fileCode = "";
		    List<String> result = new ArrayList<String>();
		    for (String line : fileClasses) {
		    	result.add(line);
		    	fileCode += line + "\n";
		    }
		    
		    if (!files.get(fileName)) {    
			    analyze(fileCode);
			    result = new ArrayList<String>();
				result.add(GlobalInfo.getInstance().getResult());
		    }
		    
			Path resultPath = Paths.get(resultFolder + SEPARATOR + fileName);
			try {
			    if (fileName.equals(GUI)) {
			    	if (!onlyModify) result.add(project + "\n");
					Path entryPath = Paths.get(entryPoint);
					List<String> entryPoint = null;
					try {
					   	entryPoint = Files.readAllLines(entryPath, ENCODING);
					} 
					catch (IOException e) {
					   	e.printStackTrace();
					}
					String aux = result.get(0);
					for (String line : entryPoint) {
					  	aux += line + "\n";
					}
					result.set(0, aux);
			    }
				Files.write(resultPath, result, ENCODING);
			} 
			catch (IOException e) {
			    	e.printStackTrace();
			}
		}
		System.out.println("Done");
	}
	
}