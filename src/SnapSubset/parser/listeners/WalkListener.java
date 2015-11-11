/* 
 *  
 * WalkListener.java
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

package parser.listeners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import parser.walkers.SnapTreeWalker;
import utils.Logger;
import utils.PragmaParser;
import antlr4.SnapGrammarBaseListener;
import antlr4.SnapGrammarListener;
import antlr4.SnapGrammarParser.And_operationContext;
import antlr4.SnapGrammarParser.And_operatorContext;
import antlr4.SnapGrammarParser.Arithmetic_operationContext;
import antlr4.SnapGrammarParser.Arithmetic_operatorContext;
import antlr4.SnapGrammarParser.ArrayContext;
import antlr4.SnapGrammarParser.Array_accessContext;
import antlr4.SnapGrammarParser.Array_utilContext;
import antlr4.SnapGrammarParser.AssignContext;
import antlr4.SnapGrammarParser.Assign_operatorContext;
import antlr4.SnapGrammarParser.Assign_utilContext;
import antlr4.SnapGrammarParser.Atomic_operationContext;
import antlr4.SnapGrammarParser.BooleanContext;
import antlr4.SnapGrammarParser.BreakContext;
import antlr4.SnapGrammarParser.Code_blockContext;
import antlr4.SnapGrammarParser.Code_block_utilContext;
import antlr4.SnapGrammarParser.Code_block_util_contentsContext;
import antlr4.SnapGrammarParser.Comparison_operationContext;
import antlr4.SnapGrammarParser.Comparison_operatorContext;
import antlr4.SnapGrammarParser.Compressed_conditionalContext;
import antlr4.SnapGrammarParser.Compressed_conditional_utilContext;
import antlr4.SnapGrammarParser.ContinueContext;
import antlr4.SnapGrammarParser.DeclarationContext;
import antlr4.SnapGrammarParser.Declaration_utilContext;
import antlr4.SnapGrammarParser.DeleteContext;
import antlr4.SnapGrammarParser.End_statementContext;
import antlr4.SnapGrammarParser.ForContext;
import antlr4.SnapGrammarParser.For_parametersContext;
import antlr4.SnapGrammarParser.For_utilContext;
import antlr4.SnapGrammarParser.Function_callContext;
import antlr4.SnapGrammarParser.Function_declarationContext;
import antlr4.SnapGrammarParser.Function_declaration_utilContext;
import antlr4.SnapGrammarParser.Glorified_arithmetic_operationContext;
import antlr4.SnapGrammarParser.Glorified_arithmetic_operatorContext;
import antlr4.SnapGrammarParser.IdContext;
import antlr4.SnapGrammarParser.IdentifierContext;
import antlr4.SnapGrammarParser.Identifier_utilContext;
import antlr4.SnapGrammarParser.IfContext;
import antlr4.SnapGrammarParser.If_utilContext;
import antlr4.SnapGrammarParser.Instanceof_operationContext;
import antlr4.SnapGrammarParser.Jsnap_codeContext;
import antlr4.SnapGrammarParser.JsonContext;
import antlr4.SnapGrammarParser.Json_contentsContext;
import antlr4.SnapGrammarParser.NegationContext;
import antlr4.SnapGrammarParser.New_object_declarationContext;
import antlr4.SnapGrammarParser.New_object_declaration_utilContext;
import antlr4.SnapGrammarParser.NumberContext;
import antlr4.SnapGrammarParser.Object_accessContext;
import antlr4.SnapGrammarParser.Object_access_utilContext;
import antlr4.SnapGrammarParser.Object_attributeContext;
import antlr4.SnapGrammarParser.OperationContext;
import antlr4.SnapGrammarParser.Or_operationContext;
import antlr4.SnapGrammarParser.ParametersContext;
import antlr4.SnapGrammarParser.Parenthesized_operationContext;
import antlr4.SnapGrammarParser.Parenthesized_operation_utilContext;
import antlr4.SnapGrammarParser.PragmaContext;
import antlr4.SnapGrammarParser.Regular_expressionContext;
import antlr4.SnapGrammarParser.ReturnContext;
import antlr4.SnapGrammarParser.Return_utilContext;
import antlr4.SnapGrammarParser.Sign_operatorContext;
import antlr4.SnapGrammarParser.Signed_operationContext;
import antlr4.SnapGrammarParser.Statement_listContext;
import antlr4.SnapGrammarParser.Statement_list_utilContext;
import antlr4.SnapGrammarParser.StringContext;
import antlr4.SnapGrammarParser.SwitchContext;
import antlr4.SnapGrammarParser.Switch_bodyContext;
import antlr4.SnapGrammarParser.Switch_caseContext;
import antlr4.SnapGrammarParser.Switch_defaultContext;
import antlr4.SnapGrammarParser.Switch_utilContext;
import antlr4.SnapGrammarParser.ThrowContext;
import antlr4.SnapGrammarParser.Try_catchContext;
import antlr4.SnapGrammarParser.Try_catch_utilContext;
import antlr4.SnapGrammarParser.Try_catch_util_catchContext;
import antlr4.SnapGrammarParser.Try_catch_util_finallyContext;
import antlr4.SnapGrammarParser.Try_catch_util_tryContext;
import antlr4.SnapGrammarParser.Typeof_operationContext;
import antlr4.SnapGrammarParser.Var_assign_utilContext;
import antlr4.SnapGrammarParser.While_utilContext;
import dataStructures.AcceptAllClassInfo;
import dataStructures.ClassInfo;
import dataStructures.ClassParents;
import dataStructures.ClassProperties;
import dataStructures.GlobalInfo;
import dataStructures.Scope;
import dataStructures.WalkInfo;


public class WalkListener extends SnapGrammarBaseListener {
	
	/*private attributes */
	
	private GlobalInfo globalInfo = GlobalInfo.getInstance();
	
	
	/* private methods */
	
	private void check(ParserRuleContext ctx) {
		ParseTreeWalker walker = new ParseTreeWalker();
		SnapGrammarListener listener = new CheckListener();
		walker.walk(listener, ctx);
	}
	
	private void walkRule(ParseTree ctx) {
    	SnapTreeWalker walker = new SnapTreeWalker();
		SnapGrammarListener listener = new WalkListener();
		walker.walk(listener, (ParserRuleContext)ctx);
	}
	
	private String trim(String s, Integer n) {
		return s.substring(0, s.length() - n);
	}
	
	private ClassInfo getSymbolFromScopeStack(String s, Scope sc) {
		ClassInfo result = sc.getSymbolOfStack(s);
		if (result != null) return new ClassInfo(result);
		return null;
	}
	
	private ClassInfo getSymbolFromAllSources(String s, Scope sc) {
		ClassInfo result = sc.getSymbolOfStack(s);
		if (result == null) result = globalInfo.getClasses().get(s);
		if (result != null) return new ClassInfo(result);
		return null;
	}
	
	private ClassInfo getClassFromPool(String s) {
		ClassInfo result = globalInfo.getClasses().get(s);
		if (result != null) return new ClassInfo(result);
		return null;
	}
	
	private ClassInfo getParameterFromLeftObjectContext(String parameter) {
		ClassInfo ci = globalInfo.getLeftSideObjectContext();
		try {
			if (ci != null) return new ClassInfo(ci.getParameter(parameter));
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("FAULTY PARAMETER = " + parameter);
			System.exit(1);
		}
		return null;
	}
	
	private ClassInfo getParameterFromSymbol(String symbol, String parameter) {
		Logger.forceToTalk(symbol);
		Logger.forceToTalk(parameter);
		ClassInfo symbolInfo = globalInfo.getCurrentScope().getSymbolOfStack(symbol);
		if (symbolInfo != null) return new ClassInfo(symbolInfo.getParameter(parameter));
		return null;
	}
	
	private void initThis(ClassInfo ci) {
		globalInfo.getDocumentScope().removeSymbol("this");
		if (ci == null) return;
		List<String> parentClass = new ArrayList<String>();
		parentClass.add(ci.getName());
		ClassInfo th = new ClassInfo("this", parentClass, ci.getProperties());
		globalInfo.getDocumentScope().addSymbol(th);
	}
	
	
	/* public methods */
	
	/********************/
    /*     TOP LEVEL    */
    /********************/
	
	//JSNAP CODE
    @Override
    public void enterJsnap_code(Jsnap_codeContext ctx) {
    	Logger.printRuleName("enterJsnap_code", ctx);
    	Scope v = new Scope();
    	v.setParentScope(null);
    	v.setSymbols(globalInfo.getDocumentSymbols());
    	globalInfo.setCurrentScope(v);
    	globalInfo.setDocumentScope(v);
    }
 
    @Override
    public void exitJsnap_code(Jsnap_codeContext ctx) {
    	Logger.printRuleName("exitJsnap_code", ctx);
    	String code = "";
    	Boolean previousValid = true;
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (w.getValid()) {
    			if (w.getCode().equals(";")) {
    				if (previousValid) {
    					code = code.replaceAll("\\s+$", "");
    					code += w.getCode() + "\n";
    				}
    			}
    			else code += w.getCode() + "\n";
    		}
    		if (code.endsWith("};\n") || code.endsWith("}\n")) code += "\n";
    		previousValid = w.getValid();
    	}
    	globalInfo.setResult(code);
    	Logger.forceToTalk("Result:");
    	Logger.forceToTalk(code);
    }
    
    
    /********************/
    /*      PRAGMA      */
    /********************/
    
    //pragma
    @Override
    public void enterPragma(PragmaContext ctx) {
    	Logger.printRuleName("enterPragma", ctx);
    	String pragma = ctx.getChild(0).getText();
    	PragmaParser pm = new PragmaParser();
    	try {
	    	if (globalInfo.isTopLevel()) pm.parsePragma(pragma);
	    	else pm.parseLocalPragma(pragma);
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		System.exit(0);
    	}
    }
    
    @Override
    public void exitPragma(PragmaContext ctx) {
    	Logger.printRuleName("exitPragma", ctx);
    	if (!globalInfo.isTopLevel()) {
	    	WalkInfo result = new WalkInfo();
	    	result.setValid(false);
	    	globalInfo.getCurrentQueue().add(result);
    	}
    }
    
    
    /********************/
    /*    STATEMENTS    */
    /********************/
    
    //DECLARATION
    @Override
    public void enterDeclaration(DeclarationContext ctx) {
    	Logger.printRuleName("enterDeclaration", ctx);
    }
    
    @Override
    public void exitDeclaration(DeclarationContext ctx) {
    	Logger.printRuleName("exitDeclaration", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.DECLARATION);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //ASSIGN
    @Override
    public void enterAssign(AssignContext ctx) {
    	Logger.printRuleName("enterAssign", ctx);
    }
    
    @Override
    public void exitAssign(AssignContext ctx) {
    	Logger.printRuleName("exitAssign", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.ASSIGN);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //IF
    @Override
    public void enterIf(IfContext ctx) {
    	Logger.printRuleName("enterIf", ctx);
    }
    
    @Override
    public void exitIf(IfContext ctx) {
    	Logger.printRuleName("exitIf", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.IF);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //TRY CATCH
    @Override
    public void enterTry_catch(Try_catchContext ctx) {
    	Logger.printRuleName("enterTry_catch", ctx);
    }
    
    @Override
    public void exitTry_catch(Try_catchContext ctx) {
    	Logger.printRuleName("exitTry_catch", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	result.setNodeType(GlobalInfo.nodeTypes.TRY_CATCH);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //RETURN
    @Override
    public void enterReturn(ReturnContext ctx) {
    	Logger.printRuleName("enterReturn", ctx);
    }
    
    @Override
    public void exitReturn(ReturnContext ctx) {
    	Logger.printRuleName("exitReturn", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	result.setNodeType(GlobalInfo.nodeTypes.RETURN);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //FOR
    @Override
    public void enterFor(ForContext ctx) {
    	Logger.printRuleName("enterFor", ctx);
    }
    
    @Override
    public void exitFor(ForContext ctx) {
    	Logger.printRuleName("exitFor", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	result.setNodeType(GlobalInfo.nodeTypes.FOR);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //SWITCH
    @Override
    public void enterSwitch(SwitchContext ctx) {
    	Logger.printRuleName("enterSwitch", ctx);
    }
    
    @Override
    public void exitSwitch(SwitchContext ctx) {
    	Logger.printRuleName("exitSwitch", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	result.setNodeType(GlobalInfo.nodeTypes.SWITCH);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //FUNCTION DECLARATION
    @Override
    public void enterFunction_declaration(Function_declarationContext ctx) {
    	Logger.printRuleName("enterFunction_declaration", ctx);
    	//we can overwrite it because technically var will always be at the beginning
    	//TODO not entirelly true, what if var a = 5, f = function...; ?
    	globalInfo.setLocalVars(new HashMap<String, ClassInfo>());
    }
    
    @Override
    public void exitFunction_declaration(Function_declarationContext ctx) {
    	Logger.printRuleName("exitFunction_declaration", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	result.setNodeType(GlobalInfo.nodeTypes.FUNCTION_DECLARATION);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //OPERATION
    @Override
    public void enterOperation(OperationContext ctx) {
    	Logger.printRuleName("enterOperation", ctx);
    }
    
    @Override
    public void exitOperation(OperationContext ctx) {
    	Logger.printRuleName("exitOperation", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	//operation inherits the child's NodeType
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //STATEMENT LIST
    @Override
    public void enterStatement_list(Statement_listContext ctx) {
    	Logger.printRuleName("enterStatement_list", ctx);
    }
    
    @Override
    public void exitStatement_list(Statement_listContext ctx) {
    	Logger.printRuleName("exitStatement_list", ctx);
    	WalkInfo result = globalInfo.getChildrenQueue().remove();
    	result.setNodeType(GlobalInfo.nodeTypes.STATEMENT_LIST);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    
    /*********************/
    /*  STATEMENT UTILS  */
    /*********************/
    
    //DECLARATION UTIL
    @Override
    public void enterDeclaration_util(Declaration_utilContext ctx) {
    	Logger.printRuleName("enterDeclaration_util", ctx);
    }
    
    @Override
    public void exitDeclaration_util(Declaration_utilContext ctx) {
    	Logger.printRuleName("exitDeclaration_util", ctx);
    	String indent = globalInfo.getIndentation();
    	String code = "var ";
    	Boolean valid = false;
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (w.getValid()) {
    			valid = true;
    			if (code.length() > 4 + indent.length() + 1) code += indent + "\t";
    			code += w.getCode();
    			code += ",\n";
    		}
    	}
    	code = trim(code, 2);
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.DECLARATION);
    	//declaration has no type (undefined technically)
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //VAR ASSIGN UTIL
    @Override
    public void enterVar_assign_util(Var_assign_utilContext ctx) {
    	Logger.printRuleName("enterVar_assign_util", ctx);
    	globalInfo.setLeftSideAssignment(true);
		for (int i = 0; i < ctx.getChildCount(); ++i) {
			walkRule(ctx.getChild(i));
			globalInfo.setLeftSideAssignment(false);
		}
		for (int i = 0; i < ctx.getChildCount(); ++i) globalInfo.getNotVisitNodes().add(i);
    	
		globalInfo.getChildrenQueue().peek().setValid(true);
		
		Scope currentScope =  globalInfo.getCurrentScope();
		Queue<WalkInfo> childrenQueue = new LinkedList<WalkInfo>(globalInfo.getChildrenQueue());
		WalkInfo first = childrenQueue.remove();
		if (!childrenQueue.isEmpty()) {
			childrenQueue.remove();
			WalkInfo second = childrenQueue.remove();
			if (second.getValid()) {
				
				ClassInfo existentSymbol = currentScope.getSymbol(first.getCode());
				
				ClassParents parentClasses = new ClassParents();
    			ClassProperties attrs = new ClassProperties();
	    		if (second.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER)) {
	    			ClassInfo copy = getSymbolFromScopeStack(second.getAlternateCode(), currentScope);
	    			parentClasses = copy.getParentClasses();
	    			attrs = copy.getProperties();
	    		}
	    		else {
	    			String[] splittedSecond = second.getCode().split("\\.");
	    			if (splittedSecond[splittedSecond.length - 1].equals("prototype") && getClassFromPool(splittedSecond[splittedSecond.length - 2]) != null) {
	    				parentClasses.addParent(second.getClassType().getName());
	    			}
	    			else {
	    				parentClasses = second.getClassType().getParentClasses();
		    			attrs = second.getClassType().getProperties();
	    			}
	    		}
				
				if (existentSymbol == null) {
					//create symbol
					ClassInfo newSymbol = new ClassInfo(first.getCode(), parentClasses, attrs);
					currentScope.addSymbol(newSymbol);
				}
				else {		
					existentSymbol.setParentClasses(parentClasses);
    				existentSymbol.setProperties(attrs);
				}
			}
		}
		else {
			//TODO is it necessary to add and undefined type?
			if (globalInfo.isTopLevel()) {
				//all toplevel vars need to be defined
				if (getSymbolFromScopeStack(first.getCode(), globalInfo.getCurrentScope()) == null) {
					globalInfo.getChildrenQueue().peek().setValid(false);
				}
			}
			else {
				ClassInfo newSymbol =  new ClassInfo(first.getCode());
				currentScope.addSymbol(newSymbol);
			}
		}
    }
    
    @Override
    public void exitVar_assign_util(Var_assign_utilContext ctx) {
    	Logger.printRuleName("exitVar_assign_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	String varName = w.getCode();
    	String code = varName + " ";
    	Boolean valid = w.getValid();
    	while(!childrenQueue.isEmpty()) {
    		w = childrenQueue.remove();
    		if (!w.getValid()) valid = false;
    		code += w.getCode() + " ";
    		if (w.getNodeType() == GlobalInfo.nodeTypes.CODE_BLOCK) {
    			ClassInfo newSymbol = new ClassInfo(varName, new ClassParents("Object"));
    			globalInfo.getCurrentScope().addSymbol(newSymbol);
    			valid = true;
    			code = code.substring(0, code.length() - w.getCode().length()) + "} ";
    		}
    	}
    	
		if (!globalInfo.isTopLevel()) {
			ClassInfo extraInfo = globalInfo.getLocalVars().get(varName);
			ClassInfo variable = globalInfo.getCurrentScope().getSymbolOfStack(varName);
			if (extraInfo != null && variable != null) {
				variable.addProperties(extraInfo.getProperties());
				variable.addParentClasses(extraInfo.getParentClasses());
				
			}
		}
    	
    	code = trim(code, 1);
    	WalkInfo result = new WalkInfo(valid, code);
    	//classType is not necessary in declarations (they always return undefined)
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //ASSIGN UTIL
    //assigns don't use the private methods to retrieve symbols, etc, because we want the original one in case we got to modify it
    @Override
    public void enterAssign_util(Assign_utilContext ctx) {
    	Logger.printRuleName("enterAssign_util", ctx);
    	globalInfo.setLeftSideAssignment(true);
		for (int i = 0; i < ctx.getChildCount(); ++i) {
			walkRule(ctx.getChild(i));
			if (i == 0) {
				globalInfo.setLeftSideAssignment(false);
				WalkInfo first = globalInfo.getChildrenQueue().peek();
				if (first.getNodeType().equals(GlobalInfo.nodeTypes.OBJECT_ACCESS)) {
					if (!first.getValid()) {
						for (int j = 0; j < ctx.getChildCount(); ++j) globalInfo.getNotVisitNodes().add(j);
						return;
					}
					//TODO a.b = c.d = 5; probably won't work, we'll need a stack, but Snap doesn't really uses this
					globalInfo.setLeftSideObjectContext(first.getClassType());
					if (!globalInfo.isTopLevel() && ctx.getChild(2).getText().startsWith("function")) {
						String s = ctx.getChild(0).getText().split("\\.")[0];
						ClassInfo thisCI = getSymbolFromAllSources(s, globalInfo.getCurrentScope());
						thisCI.setName("this");
						globalInfo.setAlternativeThis(thisCI);
					}
				}
			}
			
		}
		for (int i = 0; i < ctx.getChildCount(); ++i) globalInfo.getNotVisitNodes().add(i);
    	
		Queue<WalkInfo> aux = new LinkedList<WalkInfo>(globalInfo.getChildrenQueue());
		WalkInfo first = aux.remove();
		aux.remove();
		WalkInfo second = aux.remove();
    	if (second.getValid() && second.getClassType() != null) {
    		if (!first.getNodeType().equals(GlobalInfo.nodeTypes.OBJECT_ACCESS)) {
    			//if it's no object_access it has to be an identifier
    			ClassInfo existentSymbol = globalInfo.getCurrentScope().getSymbolOfStack(first.getCode());
    			
    			ClassParents parentClasses = new ClassParents();
    			ClassProperties attrs = new ClassProperties();
	    		if (second.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER)) {
	    			ClassInfo copy = getSymbolFromScopeStack(second.getAlternateCode(), globalInfo.getCurrentScope());
	    			parentClasses = copy.getParentClasses();
	    			attrs = copy.getProperties();
	    		}
	    		else {
	    			parentClasses = second.getClassType().getParentClasses();
	    			attrs = second.getClassType().getProperties();
	    		}
    			
    			if (existentSymbol == null) {
    				ClassInfo newSymbol =  new ClassInfo(first.getCode(), parentClasses, attrs);
    				globalInfo.getDocumentScope().addSymbol(newSymbol);
    			}
    			else {
    				existentSymbol.setParentClasses(parentClasses);
    				existentSymbol.setProperties(attrs);
    			}
    		}
    	}
    }
    
    @Override
    public void exitAssign_util(Assign_utilContext ctx) {
    	Logger.printRuleName("exitAssign_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	String varName = w.getCode();
    	String code = varName + " ";
    	Boolean valid = true;
    	if (w.getNodeType().equals(GlobalInfo.nodeTypes.OBJECT_ACCESS)) valid = w.getValid();
    	ClassInfo type = null;
    	while(!childrenQueue.isEmpty()) {
    		w = childrenQueue.remove();
    		if (!w.getValid()) valid = false;
    		code += w.getCode() + " ";
    		type = w.getClassType();
    		if (w.getNodeType() == GlobalInfo.nodeTypes.CODE_BLOCK) {
    			valid = true;
    			code = code.substring(0, code.length() - w.getCode().length()) + "} ";
    			type = new ClassInfo("", new ClassParents("Object"));
    		}
    	}
    	
		if (!globalInfo.isTopLevel()) {
			ClassInfo extraInfo = globalInfo.getLocalVars().get(varName);
			ClassInfo variable = globalInfo.getCurrentScope().getSymbolOfStack(varName);
			if (extraInfo != null && variable != null) {
				variable.addProperties(extraInfo.getProperties());
				variable.addParentClasses(extraInfo.getParentClasses());
			}
		}
    	
    	code = trim(code, 1);
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.ASSIGN);
    	result.setClassType(type);
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.setLeftSideObjectContext(null);
    }
    
    //IF UTIL
    @Override
    public void enterIf_util(If_utilContext ctx) {
    	Logger.printRuleName("enterIf_util", ctx);
    	if (!ctx.getChild(2).getText().equals(")")) {
        	walkRule(ctx.getChild(2));
        	Queue<WalkInfo> aux = new LinkedList<WalkInfo>(globalInfo.getChildrenQueue());
    		WalkInfo w = aux.remove();
    		if (!w.getValid()) {
    			for (int i = 0; i < ctx.getChildCount(); ++i) globalInfo.getNotVisitNodes().add(i); 
    		}
    		else globalInfo.getNotVisitNodes().add(2);
    	}
    }
    
    @Override
    public void exitIf_util(If_utilContext ctx) {
    	Logger.printRuleName("exitIf_util", ctx);
    	String code = "if ";
    	String condition = "(";
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	Boolean negated_condition = false;
    	condition += w.getCode() + ")";
    	//if the condition is invalid we'll destroy the entire if statement
    	//maybe this is too drastic?
    	if (valid) {
        	w = childrenQueue.remove();
    		if (w.getValid()) {
    			code += condition + " " + w.getCode();
    		}
    		else {
    			condition = "(!" + condition + ")";
    			if (!childrenQueue.isEmpty() && childrenQueue.peek().getCode().equals(";")) {
    				childrenQueue.remove();
    			}
    			valid = false;
    			negated_condition = true;
    		}
    		
        	
        	if (!childrenQueue.isEmpty()) {
        		w = childrenQueue.remove();
        		if (w.getValid()) {
	        		if (negated_condition) {
	        			code += condition + " " + w.getCode();
	        			valid = true;
	        		}
	        		else if (!negated_condition) {
	        			code += "\n" + globalInfo.getIndentation() + "else " + w.getCode();
	        		}
        		}
        	}
    	}
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.IF);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //TRY CATCH UTIL
    @Override
    public void enterTry_catch_util(Try_catch_utilContext ctx) {
    	Logger.printRuleName("enterTry_catch_util", ctx);
    }
    
    @Override
    public void exitTry_catch_util(Try_catch_utilContext ctx) {
    	Logger.printRuleName("exitTry_catch_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	String indent = globalInfo.getIndentation();
		WalkInfo w = childrenQueue.remove();
		
		if (w.getValid()) {
			code += w.getCode();
			w = childrenQueue.remove();
			String auxCode = "";
			if (w.getNodeType().equals(GlobalInfo.nodeTypes.TRY_CATCH_UTIL_CATCH)) {
				valid = w.getValid();
				if (valid) code += "\n" + indent + w.getCode();
				else auxCode += "\n" + indent + "catch (e) {\n\n" + indent + "}";
			}
			
			if (!childrenQueue.isEmpty()) w = childrenQueue.remove();
			
			if (w.getNodeType().equals(GlobalInfo.nodeTypes.TRY_CATCH_UTIL_FINALLY)) {	
				if (w.getValid()) {
					code += "\n" + indent + w.getCode();
					valid = true;
				}
				else {
					if (!valid) code += auxCode;
					valid = true;
				}
			}
			else {
				if (!valid) code += auxCode;
				valid = true;
			}
			
			
		}
		else {
			valid = false;
		}
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.TRY_CATCH);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //TRY CATCH UTIL TRY
    @Override
    public void enterTry_catch_util_try(Try_catch_util_tryContext ctx) {
    	Logger.printRuleName("enterTry_catch_util_try", ctx);
    }
    
    @Override
    public void exitTry_catch_util_try(Try_catch_util_tryContext ctx) {
    	Logger.printRuleName("exitTry_catch_util_try", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = false;
    	String code = "";
		WalkInfo w = childrenQueue.remove();
		if (w.getValid()) {
			valid = true;
			code += "try " + w.getCode();
		}
		WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.TRY_CATCH_UTIL_TRY);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //TRY CATCH UTIL CATCH
    @Override
    public void enterTry_catch_util_catch(Try_catch_util_catchContext ctx) {
    	Logger.printRuleName("enterTry_catch_util_catch", ctx);
    	 globalInfo.getNotVisitNodes().add(2);
    }
    
    @Override
    public void exitTry_catch_util_catch(Try_catch_util_catchContext ctx) {
    	Logger.printRuleName("exitTry_catch_util_catch", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = false;
    	String code = "catch (" + ctx.getChild(2).getText() + ") ";
		WalkInfo w = childrenQueue.remove();
		if (w.getValid()) {
			valid = true;
			code += w.getCode();
		}
		WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.TRY_CATCH_UTIL_CATCH);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //TRY CATCH UTIL FINALLY
    @Override
    public void enterTry_catch_util_finally(Try_catch_util_finallyContext ctx) {
    	Logger.printRuleName("enterTry_catch_util_finally", ctx);
    }
    
    @Override
    public void exitTry_catch_util_finally(Try_catch_util_finallyContext ctx) {
    	Logger.printRuleName("exitTry_catch_util_finally", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = false;
    	String code = "";
		WalkInfo w = childrenQueue.remove();
		if (w.getValid()) {
			valid = true;
			code += "finally " + w.getCode();
		}
		WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.TRY_CATCH_UTIL_FINALLY);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //RETURN UTIL
    @Override
    public void enterReturn_util(Return_utilContext ctx) {
    	Logger.printRuleName("enterReturn_util", ctx);
    }
    
    @Override
    public void exitReturn_util(Return_utilContext ctx) {
    	Logger.printRuleName("exitReturn_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = false;
    	String code = "return";
    	if (childrenQueue.isEmpty()) {
    		valid = true;
    	}
    	else {
    		WalkInfo w = childrenQueue.remove();
    		if (w.getValid()) {
    			code += " " + w.getCode();
    			valid = true;
    		}
    	}
    	
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.RETURN);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //WHILE UTIL
    @Override
    public void enterWhile_util(While_utilContext ctx) {
    	Logger.printRuleName("enterWhile_util", ctx);
    }
    
    @Override
    public void exitWhile_util(While_utilContext ctx) {
    	Logger.printRuleName("exitWhile_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = "while (" + w.getCode() + ") ";
    	if (valid) {
    		w = childrenQueue.remove();
    		valid = w.getValid();
        	code += w.getCode();
    	}
    	
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.WHILE);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //FOR UTIL
    @Override
    public void enterFor_util(For_utilContext ctx) {
    	Logger.printRuleName("enterFor_util", ctx);
    }
    
    @Override
    public void exitFor_util(For_utilContext ctx) {
    	Logger.printRuleName("exitFor_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = "for (" + w.getCode() + ") ";
    	if (valid) {
    		w = childrenQueue.remove();
    		valid = w.getValid();
        	code += w.getCode();
    	}
    	
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.FOR);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //FOR PARAMETERS
    @Override
    public void enterFor_parameters(For_parametersContext ctx) {
    	Logger.printRuleName("enterFor_parameters", ctx);
    }
    
    @Override
    public void exitFor_parameters(For_parametersContext ctx) {
    	Logger.printRuleName("exitFor_parameters", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	
    	if (ctx.getChildCount() == 3) {
			WalkInfo w = childrenQueue.remove();
			if (!w.getValid()) valid = false;
			code += w.getCode() + " in ";
			w = childrenQueue.remove();
			code += w.getCode();
			if (!w.getValid()) valid = false;
    	}
    	else {
    		while (!childrenQueue.isEmpty()) {
    			WalkInfo w = childrenQueue.remove();
    			if (!w.getValid()) valid = false;
    			code += w.getCode() + "; ";
    		}
    		code = trim(code,  2);
    	}
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.FOR_PARAMETERS);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //FUNCTION DECLARATION UTIL
    @Override
    public void enterFunction_declaration_util(Function_declaration_utilContext ctx) {
    	Logger.printRuleName("enterFunction_declaration_util", ctx);
		List<Integer> visitedChildren = new ArrayList<Integer>();
		//one scope for the function parameters
		globalInfo.stepIntoScope(false);
		//one for the contents
		globalInfo.stepIntoScope(false);
		Scope currentScope = globalInfo.getCurrentScope();
		if (globalInfo.getAlternativeThis() != null) {
			currentScope.addSymbol(globalInfo.getAlternativeThis());
			globalInfo.setAlternativeThis(null);
		}
		for (int i = 0; i < ctx.getChildCount(); ++i) {
			if (ctx.getChild(i).getText().equals("function")) {
				String nextNodetext = ctx.getChild(i + 1).getText();
				if (!nextNodetext.equals("(")) {
					walkRule(ctx.getChild(i + 1));
					visitedChildren.add(i + 1);
					if (globalInfo.isTopLevel()) {
						if (!globalInfo.getChildrenQueue().peek().getValid()) {
							visitedChildren.add(2); visitedChildren.add(3); visitedChildren.add(4); visitedChildren.add(5);
							break;
						}
						//init this for Constructors
						ClassInfo functionClass = getClassFromPool(ctx.getChild(i + 1).getText());
						initThis(functionClass);
					}
					else {
						globalInfo.getChildrenQueue().peek().setValid(true);
			    		List<ClassInfo> att = new ArrayList<ClassInfo>();
			    		ClassInfo fCall = new ClassInfo("()", new ClassParents("Joker"));
			    		att.add(fCall);
			    		att.add(new ClassInfo("call", new ClassParents("Function"), Arrays.asList(new ClassInfo[]{fCall})));
			    		ClassInfo cl = new ClassInfo(nextNodetext, new ClassParents("Function"), att);
			    		currentScope.addSymbol(cl);
					}
				}
			}
			else if (ctx.getChild(i).getText().equals("(")) {
				if (!ctx.getChild(i + 1).getText().equals(")")) {
					walkRule(ctx.getChild(i + 1));
					//anyadimos los parametros al ambito de visibilidad
					Queue<WalkInfo> childrenQueue = new LinkedList<WalkInfo>(globalInfo.getChildrenQueue());
					WalkInfo w = childrenQueue.remove();
					if (!childrenQueue.isEmpty()) {
						w = childrenQueue.remove();
					}
					
					String[] parameters = w.getAlternateCode().split(", ");
					if (!globalInfo.isTopLevel()) {
						for (String p : parameters) globalInfo.getCurrentScope().addSymbol(new AcceptAllClassInfo(p.trim(), new ClassParents("Joker")));
					}
					else {
						if (globalInfo.getLeftSideObjectContext() != null) {
							for (String p : parameters) {
								currentScope.addSymbol(getParameterFromLeftObjectContext(p));
							}
						}
						else {
							for (String p : parameters) {
								currentScope.addSymbol(getParameterFromSymbol(ctx.getChild(1).getText(), p));
							}
						}
					}
					visitedChildren.add(i + 1);
				}
			}
		}
		//this needs to be done always AFTER visiting the child nodes
		for (Integer i : visitedChildren) globalInfo.getNotVisitNodes().add(i);
    }
    
    @Override
    public void exitFunction_declaration_util(Function_declaration_utilContext ctx) {
    	Logger.printRuleName("exitFunction_declaration_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String code = "function ";
    	Boolean valid = true;
    	WalkInfo w = childrenQueue.remove();
    	WalkInfo result = new WalkInfo();
    	String functionName = "";
    	
    	if ((w.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER) && w.getValid()) || !w.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER)) {
	    	if (!childrenQueue.isEmpty()) {
		    	if (w.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER)) {
		    		code += w.getCode();
		    		functionName = w.getCode();
		    		w = childrenQueue.remove();
		    	}
		    	
		    	if(w.getNodeType().equals(GlobalInfo.nodeTypes.PARAMETERS)) {
		    		code += "(" + w.getAlternateCode() + ")";
		    		w = childrenQueue.remove();
		    	}
		    	else {
		    		code += "()";
		    	}
	    	}
	    	else {
	    		code += "()";
	    	}
	    	code += " ";
	    	valid = w.getValid();
	    	code += w.getCode();
    	}
    	else valid = false;
    
    	//step out of the function visibility contexts
    	globalInfo.stepOutOfScope(false);
    	globalInfo.stepOutOfScope(false);
    	
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.FUNCTION_DECLARATION);

    	//add function to scope (if valid)
    	ClassInfo function = null;
    	if (valid && !globalInfo.isTopLevel()) {
        	List<ClassInfo> att = new ArrayList<ClassInfo>();
    		ClassInfo fCall = new ClassInfo("()", new ClassParents("Joker"));
    		att.add(fCall);
    		att.add(new ClassInfo("call", new ClassParents("Function"), Arrays.asList(new ClassInfo[]{fCall})));
    		function = new ClassInfo(functionName, new ClassParents("Function"), att);
    		result.setClassType(function);
    	}
    	else {
    		result.setClassType(getSymbolFromScopeStack(w.getCode(), globalInfo.getCurrentScope()));
    	}
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //SWITCH UTIL
    @Override
    public void enterSwitch_util(Switch_utilContext ctx) {
    	Logger.printRuleName("enterSwitch_util", ctx);
    }
    
    @Override
    public void exitSwitch_util(Switch_utilContext ctx) {
    	Logger.printRuleName("exitSwitch_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = "switch (" + w.getCode() + ") ";
    	if (valid) {
    		w = childrenQueue.remove();
    		valid = w.getValid();
        	code += w.getCode();
    	}
    	
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.SWITCH);
    	globalInfo.getCurrentQueue().add(result);
    }

    //SWITCH BODY
    @Override
    public void enterSwitch_body(Switch_bodyContext ctx) {
    	Logger.printRuleName("enterSwitch_body", ctx);
    	globalInfo.increaseindentationLevel();
    }
    
    @Override
    public void exitSwitch_body(Switch_bodyContext ctx) {
    	Logger.printRuleName("exitSwitch_body", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String indent = globalInfo.getIndentation();
    	Boolean valid = false;
    	String code = "{";
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (w.getValid()) {
    			valid = true;
    			code += "\n" + indent + w.getCode();
    		}	
    	}
    	code += "\n" + indent.substring(1) + "}";
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.SWITCH_BODY);
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.decreaseindentationLevel();
    }
    
    //SWITCH CASE
    @Override
    public void enterSwitch_case(Switch_caseContext ctx) {
    	Logger.printRuleName("enterSwitch_case", ctx);
    	globalInfo.increaseindentationLevel();
    }
    
    @Override
    public void exitSwitch_case(Switch_caseContext ctx) {
    	Logger.printRuleName("exitSwitch_case", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String indent = globalInfo.getIndentation();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = "case " + w.getCode() + ":";
    	if (valid) {
	    	while(!childrenQueue.isEmpty()) {
	    		w = childrenQueue.remove();
	    		if (w.getValid()) {
	    			code += "\n" + indent + w.getCode();
	    		}	
	    	}
    	}
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.SWITCH_CASE);
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.decreaseindentationLevel();
    }
    
    //SWITCH DEFAULT
    @Override
    public void enterSwitch_default(Switch_defaultContext ctx) {
    	Logger.printRuleName("enterSwitch_default", ctx);
    	globalInfo.increaseindentationLevel();
    }
    
    @Override
    public void exitSwitch_default(Switch_defaultContext ctx) {
    	Logger.printRuleName("exitSwitch_default", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String indent = globalInfo.getIndentation();
    	Boolean valid = false;
    	String code = "default:";
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (w.getValid()) {
    			valid = true;
    			code += "\n" + indent + w.getCode();
    		}	
    	}
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.SWITCH_DEFAULT);
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.decreaseindentationLevel();
    }
    
    
    //STATEMENT LIST UTIL
    @Override
    public void enterStatement_list_util(Statement_list_utilContext ctx) {
    	Logger.printRuleName("enterStatement_list_util", ctx);
    }
    
    @Override
    public void exitStatement_list_util(Statement_list_utilContext ctx) {
    	Logger.printRuleName("exitStatement_list_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String code = "";
    	String fullCode = "";
    	Boolean valid = true;
    	ClassInfo type = null;
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (w.getValid()) {
    			code += w.getCode();
    			if (code.length() > 0) code += ", ";
    			type = w.getClassType();
    		}
    		else valid = false;
    		fullCode += w.getCode() + ", ";
    	}
    	if (code.length() > 0) code = trim(code, 2);
    	if (fullCode.length() > 0) fullCode = trim(fullCode, 2);
    	WalkInfo result = new WalkInfo(valid, code, fullCode);
    	result.setNodeType(GlobalInfo.nodeTypes.STATEMENT_LIST);
    	result.setClassType(type);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //END STATEMENT
    @Override
    public void enterEnd_statement(End_statementContext ctx) {
    	//Logger.printRuleName("enterEnd_statement", ctx);
    	check(ctx);
    }
    
    @Override
    public void exitEnd_statement(End_statementContext ctx) {
    	//Logger.printRuleName("exitEnd_statement", ctx);
    }
   
    //ASSIGN OPERATOR
    @Override
    public void enterAssign_operator(Assign_operatorContext ctx) {
    	Logger.printRuleName("enterAssign_operator", ctx);
    	check(ctx);
    }
    
    @Override
    public void exitAssign_operator(Assign_operatorContext ctx) {
    	Logger.printRuleName("exitAssign_operator", ctx);
    }

    
    /********************/
    /*   INSTRUCTIONS   */
    /********************/
    
    //BREAK
    @Override
    public void enterBreak(BreakContext ctx) {
    	Logger.printRuleName("enterBreak", ctx);
    }
    
    @Override
    public void exitBreak(BreakContext ctx) {
    	Logger.printRuleName("exitBreak", ctx);
    	WalkInfo result = new WalkInfo(true, "break");
		result.setNodeType(GlobalInfo.nodeTypes.BREAK);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //CONTINUE
    @Override
    public void enterContinue(ContinueContext ctx) {
    	Logger.printRuleName("enterContinue", ctx);
    }
    
    @Override
    public void exitContinue(ContinueContext ctx) {
    	Logger.printRuleName("exitContinue", ctx);
    	WalkInfo result = new WalkInfo(true, "continue;");
		result.setNodeType(GlobalInfo.nodeTypes.CONTINUE);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //THROW
    @Override
    public void enterDelete(DeleteContext ctx) {
    	Logger.printRuleName("enterDelete", ctx);
    }
    
    @Override
    public void exitDelete(DeleteContext ctx) {
    	Logger.printRuleName("exitDelete", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String code = "delete ";
		WalkInfo w = childrenQueue.remove();
		Boolean valid = w.getValid();
		code += w.getCode();
		WalkInfo result = new WalkInfo(valid, code);
		result.setNodeType(GlobalInfo.nodeTypes.DELETE);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //DELETE
    @Override
    public void enterThrow(ThrowContext ctx) {
    	Logger.printRuleName("enterThrow", ctx);
    }
    
    @Override
    public void exitThrow(ThrowContext ctx) {
    	Logger.printRuleName("exitThrow", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String code = "throw ";
		WalkInfo w = childrenQueue.remove();
		Boolean valid = w.getValid();
		code += w.getCode();
		WalkInfo result = new WalkInfo(valid, code);
		result.setNodeType(GlobalInfo.nodeTypes.THROW);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //SIGNED OPERATION
    @Override
    public void enterSigned_operation(Signed_operationContext ctx) {
    	Logger.printRuleName("enterSigned_operation", ctx);
    }
    
    @Override
    public void exitSigned_operation(Signed_operationContext ctx) {
    	Logger.printRuleName("exitSigned_operation", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	String code = w.getCode();
    	w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	code += w.getCode();
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.SIGNED_OPERATION);
    	result.setClassType(new ClassInfo("", new ClassParents("Number")));
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //ARITHMETIC OPERATION
    @Override
    public void enterArithmetic_operation(Arithmetic_operationContext ctx) {
    	Logger.printRuleName("enterArithmetic_operation", ctx);
    }
    
    @Override
    public void exitArithmetic_operation(Arithmetic_operationContext ctx) {
    	Logger.printRuleName("exitGlorified_arithmetic_operation", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	WalkInfo o1 = childrenQueue.remove();
    	WalkInfo operator = childrenQueue.remove();
    	WalkInfo o2 = childrenQueue.remove();
    	WalkInfo result = new WalkInfo();
    	if (!o1.getValid() && !o2.getValid()) valid = false;
    	
    	if (valid) {
    		//TODO classType not entirelly correct, eventually it would be nice to have a calss that manages all this JavaScript stuff
	    	code = o1.getCode() + " " + operator.getCode() + " " + o2.getCode();
	    	result.setClassType(o1.getClassType());
			if (!o1.getValid()) {
				code = o2.getCode();
				result.setClassType(o2.getClassType());
			}
			else if (!o2.getValid()) {
				code = o1.getCode();
				result.setClassType(o1.getClassType());
			}
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.ARITHMETIC_OPERATION);  	
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //GLORIFIED ARITHMETIC OPERATION
    @Override
    public void enterGlorified_arithmetic_operation(Glorified_arithmetic_operationContext ctx) {
    	Logger.printRuleName("enterGlorified_arithmetic_operation", ctx);
    }
    
    @Override
    public void exitGlorified_arithmetic_operation(Glorified_arithmetic_operationContext ctx) {
    	Logger.printRuleName("exitGlorified_arithmetic_operation", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	WalkInfo o1 = childrenQueue.remove();
    	WalkInfo operator = childrenQueue.remove();
    	WalkInfo o2 = childrenQueue.remove();
    	WalkInfo result = new WalkInfo();
    	if (!o1.getValid() && !o2.getValid()) valid = false;
    	
    	if (valid) {
    		//TODO classType not entirelly correct, see above
	    	code = o1.getCode() + " " + operator.getCode() + " " + o2.getCode();
	    	result.setClassType(o1.getClassType());
			if (!o1.getValid()) {
				code = o2.getCode();
				result.setClassType(o2.getClassType());
			}
			else if (!o2.getValid()) {
				code = o1.getCode();
				result.setClassType(o1.getClassType());
			}
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.GLORIFIED_ARITHMETIC_OPERATION);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //COMPARISON OPERATION
    @Override
    public void enterComparison_operation(Comparison_operationContext ctx) {
    	Logger.printRuleName("enterComparison_operation", ctx);
    }
    
    @Override
    public void exitComparison_operation(Comparison_operationContext ctx) {
    	Logger.printRuleName("exitComparison_operation", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (!w.getValid()) valid = false;
    		code += w.getCode() + " ";
    	}
    	code = trim(code, 1);
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.COMPARISON_OPERATION);
    	result.setClassType(new ClassInfo("", new ClassParents("Boolean")));
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //AND OPERATION
    @Override
    public void enterAnd_operation(And_operationContext ctx) {
    	Logger.printRuleName("enterAnd_operation", ctx);
    }
    
    @Override
    public void exitAnd_operation(And_operationContext ctx) {
    	Logger.printRuleName("exitAnd_operation", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	while(!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
    		if (!w.getValid()) valid = false;
    		code += w.getCode() + " ";
    	}
    	code = trim(code, 1);
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.AND_OPERATION);
		result.setClassType(new ClassInfo("", new ClassParents("Boolean")));
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //INSTANCEOF OPERATION
    @Override
    public void enterInstanceof_operation(Instanceof_operationContext ctx) {
    	Logger.printRuleName("enterInstanceof_operation", ctx);
    }
    
    @Override
    public void exitInstanceof_operation(Instanceof_operationContext ctx) {
    	Logger.printRuleName("exitInstanceof_operation", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	Boolean valid = w.getValid();
    	String code = w.getCode() + " instanceof ";
    	w = globalInfo.getChildrenQueue().remove();
    	code += w.getCode();
    	if (valid) valid = w.getValid();
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.INSTANCEOF);
    	result.setClassType(new ClassInfo("", new ClassParents("Boolean")));
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //TYPEOF OPERATION
    @Override
    public void enterTypeof_operation(Typeof_operationContext ctx) {
    	Logger.printRuleName("enterTypeof_operation", ctx);
    }
    
    @Override
    public void exitTypeof_operation(Typeof_operationContext ctx) {
    	Logger.printRuleName("exitTypeof_operation", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	Boolean valid = w.getValid();
    	String code = "typeof " + w.getCode();
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.TYPEOF);
    	result.setClassType(new ClassInfo("", new ClassParents("Boolean")));
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //ATOMIC OPERATION
    @Override
    public void enterAtomic_operation(Atomic_operationContext ctx) {
    	Logger.printRuleName("enterAtomic_operation", ctx);
    }
    
    @Override
    public void exitAtomic_operation(Atomic_operationContext ctx) {
    	Logger.printRuleName("exitAtomic_operation", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //OR OPERATION
    @Override
    public void enterOr_operation(Or_operationContext ctx) {
    	Logger.printRuleName("enterOr_operation", ctx);
    }
    
    @Override
    public void exitOr_operation(Or_operationContext ctx) {
    	Logger.printRuleName("exitOr_operation", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();	
    	Boolean valid = true;
    	String code = "";
    	WalkInfo o1 = childrenQueue.remove();
    	WalkInfo o2 = childrenQueue.remove();
    	WalkInfo result = new WalkInfo();
    	if (!o1.getValid() && !o2.getValid()) valid = false;
    	
    	if (valid) {
	    	code = o1.getCode() + " || " + o2.getCode();
	    	result.setClassType(o1.getClassType());
			if (!o1.getValid()) {
				code = o2.getCode();
				result.setClassType(o2.getClassType());
			}
			else if (!o2.getValid()) {
				code = o1.getCode();
				result.setClassType(o1.getClassType());
			}
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.OR_OPERATION);  	
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //OBJECT ACCESS UTIL
    @Override
    public void enterObject_access_util(Object_access_utilContext ctx) {
    	Logger.printRuleName("enterObject_access_util", ctx);
    	
    	globalInfo.getObjectScope().push(globalInfo.getObjectContext());
    	globalInfo.setObjectContext(null);
    	
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	walkRule(ctx.getChild(0));
    	
    	WalkInfo w = childrenQueue.peek();
    	if (w.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER)) {
    		ClassInfo ci = getSymbolFromAllSources(w.getCode(), globalInfo.getCurrentScope());	
			ClassInfo aux = getClassFromPool(w.getCode());
			if (aux == null) {
				aux = getSymbolFromScopeStack(w.getCode(), globalInfo.getCurrentScope());
			}
			if (aux != null) ci = aux;
    		if (globalInfo.isTopLevel()) {
    			initThis(ci);
    		}
    		
			if (ci != null) {
				globalInfo.setObjectContext(ci);
			}
			else {
				w.setValid(false);
				for (int i = 0; i < ctx.getChildCount(); ++i) globalInfo.getNotVisitNodes().add(i);
				return;
    		}
    	}
    	else {
    		if (w.getValid()) {
    			globalInfo.setObjectContext(w.getClassType());
    		}
    	}
    	globalInfo.getNotVisitNodes().add(0);
    }
    
    @Override
    public void exitObject_access_util(Object_access_utilContext ctx) {
    	Logger.printRuleName("exitObject_access_util", ctx);
    	String code = "";
    	Boolean valid = true;
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();    	
    	WalkInfo w = null;
    	while(!childrenQueue.isEmpty()) {
    		w = childrenQueue.remove();
    		code += w.getCode() + ".";
    		if (!w.getValid()) valid = false;
    	}
    	code = trim(code, 1);
    	WalkInfo result = new WalkInfo(valid, code);
    	if (valid) {
    		if (w.getNodeType().equals(GlobalInfo.nodeTypes.IDENTIFIER)) {
    			if (w.getCode().equals("prototype")) {
    				result.setClassType(getSymbolFromAllSources(globalInfo.getPreviousObjectContext().getName(), globalInfo.getCurrentScope()));
    			}
    			else if (getClassFromPool(w.getClassType().getName()) != null) {
		    		result.setClassType(w.getClassType());
		    	}
		    	else {
		    		result.setClassType(globalInfo.getPreviousObjectContext().getProperty(w.getClassType().getName()));
		    	}
    		}
    		else result.setClassType(w.getClassType());
    	}
    	result.setNodeType(GlobalInfo.nodeTypes.OBJECT_ACCESS);	
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.setObjectContext(globalInfo.getObjectScope().pop());
    }
    
    //ARRAY ACCESS
    @Override
    public void enterArray_access(Array_accessContext ctx) {
    	Logger.printRuleName("enterArray_access", ctx);
    	
    	globalInfo.getObjectScope().push(globalInfo.getObjectContext());
    	globalInfo.setObjectContext(null);
    	
    	ClassInfo saveCurrentAccess = globalInfo.getCurrentAccess();
    	//technically an array access always has some content
    	//just in case something changes in the future
    	if (ctx.getChildCount() > 2) {
    		walkRule(ctx.getChild(1));
    		globalInfo.getNotVisitNodes().add(1);
    	}
    	globalInfo.setCurrentAccess(saveCurrentAccess);
    }
    
    @Override
    public void exitArray_access(Array_accessContext ctx) {
    	Logger.printRuleName("exitArray_access", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo result = new WalkInfo();
    	WalkInfo w = childrenQueue.remove();
    	String code = "[" + w.getCode() + "]";
    	Boolean valid = w.getValid();
    	if (valid) {
	    	ClassInfo currAccess = globalInfo.getCurrentAccess();
	    	if (currAccess != null) {
	    		ClassInfo arrAccess = currAccess.getProperty("[]");
	    		if (arrAccess != null) {
	    			ClassInfo ci = new ClassInfo();
	    			ci.setName("");
	    			ci.setParentClasses(new ClassParents());
	    			ci.addProperties(arrAccess.getProperties());
	    			for (String parentClass : arrAccess.getParentClasses().getAllParents()) {
		    			ClassInfo aux = getClassFromPool(parentClass);
		    			ci.getParentClasses().addParent(parentClass);
		    			if (aux != null) {
		    				ci.addProperties(aux.getProperties());
		    			}
		    			else {
		    				//this means the Metadata is incomplete
		    				//TODO throw an error
		    			}
	    			}
	    			result.setClassType(ci);
	    			globalInfo.setCurrentAccess(ci);
	    		}
	    		else {
	    			//we'll supose that if we access something that isn't an array in this way
	    			//we want to get a property of the object
	    			//TODO parentClasses should be the set that encompasses all properties classes
	    			//also add all properties
	    			//but maybe it's overkill
	    			
	    			ClassInfo ci = new AcceptAllClassInfo();
	    			ci.setName("");
	    			ci.setParentClasses(new ClassParents("Joker"));
	    			result.setClassType(ci);
	    			globalInfo.setCurrentAccess(ci);
	    		}
	    	}
	    	else valid = false;
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.ARRAY_ACCESS);
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.setObjectContext(globalInfo.getObjectScope().pop());
    }
      
    //FUNCTION CALL
    @Override
    public void enterFunction_call(Function_callContext ctx) {
    	Logger.printRuleName("enterFunction_call", ctx);
    	
    	globalInfo.getObjectScope().push(globalInfo.getObjectContext());
    	globalInfo.setObjectContext(null);
    	
    	ClassInfo saveCurrentAccess = globalInfo.getCurrentAccess();
    	//function call can be done without parameters
    	if (ctx.getChildCount() > 2) {
    		walkRule(ctx.getChild(1));
    		globalInfo.getNotVisitNodes().add(1);
    	}
    	globalInfo.setCurrentAccess(saveCurrentAccess);
    }
    
    @Override
    public void exitFunction_call(Function_callContext ctx) {
    	Logger.printRuleName("exitFunction_call", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo result = new WalkInfo();
    	String code = "(";
    	Boolean valid = true;
    	if (!childrenQueue.isEmpty()) {
    		WalkInfo w = childrenQueue.remove();
	    	code += w.getCode() + ")";
	    	valid = w.getValid();
    	}
    	else {
    		code += ")";
    	}
    	if (valid) {
	    	ClassInfo currAccess = globalInfo.getCurrentAccess();
	    	if (currAccess != null) {
	    		ClassInfo arrAccess = currAccess.getProperty("()");
	    		if (arrAccess != null) {
	    			ClassInfo ci = new ClassInfo();
	    			ci.setName("");
	    			ci.setParentClasses(new ClassParents());
	    			ci.addProperties(arrAccess.getProperties());
	    			for (String parentClass : arrAccess.getParentClasses().getAllParents()) {
		    			ClassInfo aux = getClassFromPool(parentClass);
		    			ci.getParentClasses().addParent(parentClass);
		    			if (aux != null) {
		    				ci.addProperties(aux.getProperties());
		    			}
		    			else {
		    				//unexistant class indicates incomplete Metadata
		    			}
	    			}
	    			result.setClassType(ci);
	    			globalInfo.setCurrentAccess(ci);
	    		}
	    		else {
	    			globalInfo.setCurrentAccess(null);
	    			valid = false;
	    		}
	    	}
	    	else valid = false;
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.FUNCTION_CALL);
    	globalInfo.getCurrentQueue().add(result);
    	globalInfo.setObjectContext(globalInfo.getObjectScope().pop());
    }
    
    //NEGATION
    @Override
    public void enterNegation(NegationContext ctx) {
    	Logger.printRuleName("enterNegation", ctx);
    }
    
    @Override
    public void exitNegation(NegationContext ctx) {
    	Logger.printRuleName("exitNegation", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setCode("!" + w.getCode());
    	w.setNodeType(GlobalInfo.nodeTypes.NEGATION);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //PARENTHESIZED OPERATION
    @Override
    public void enterParenthesized_operation(Parenthesized_operationContext ctx) {
    	Logger.printRuleName("enterParenthesized_operation", ctx);
    }
    
    @Override
    public void exitParenthesized_operation(Parenthesized_operationContext ctx) {
    	Logger.printRuleName("exitParenthesized_operation", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.PARENTHESIZED_OPERATION);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //COMPRESSED CONDITIONAL
    @Override
    public void enterCompressed_conditional(Compressed_conditionalContext ctx) {
    	Logger.printRuleName("enterCompressed_conditional", ctx);
    }
    
    @Override
    public void exitCompressed_conditional(Compressed_conditionalContext ctx) {
    	Logger.printRuleName("exitCompressed_conditional", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.COMPRESSED_CONDITIONAL);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //COMPRESSED CONDITIONAL UTIL
    @Override
    public void enterCompressed_conditional_util(Compressed_conditional_utilContext ctx) {
    	Logger.printRuleName("enterCompressed_conditional_util", ctx);
    }
    
    @Override
    public void exitCompressed_conditional_util(Compressed_conditional_utilContext ctx) {
    	Logger.printRuleName("exitCompressed_conditional_util", ctx);
    	String code = "";
    	Boolean valid = true;
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	if (!w.getValid()) valid = false;
    	code += w.getCode() + " ? ";
    	WalkInfo c1 = childrenQueue.remove();
    	if (!c1.getValid()) valid = false;
    	code += c1.getCode() + " : ";
    	WalkInfo c2 = childrenQueue.remove();
    	if (!c2.getValid()) valid = false;
    	code += c2.getCode();
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.COMPRESSED_CONDITIONAL);
    	ClassInfo resultClass = new ClassInfo();
    	if (valid) {
    		resultClass.setParentClasses(c1.getClassType().getParentClasses());
    		resultClass.addParentClasses(c2.getClassType().getParentClasses());
    		resultClass.setProperties(c1.getClassType().getProperties());
    		resultClass.addProperties(c2.getClassType().getProperties());
    	}
    	result.setClassType(resultClass);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    
    /*********************/
    /* INSTRUCTION UTILS */
    /*********************/
    
    //PARENTHESIZED OPERATION UTIL
    @Override
    public void enterParenthesized_operation_util(Parenthesized_operation_utilContext ctx) {
    	Logger.printRuleName("enterParenthesized_operation_util", ctx);
    	globalInfo.setCurrentAccess(null);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	walkRule(ctx.getChild(1));
    	WalkInfo w = childrenQueue.peek();
    	if (w.getValid()) {
    		globalInfo.getNotVisitNodes().add(1);
    		globalInfo.setCurrentAccess(w.getClassType());
    	}
    	else {
    		for (int i = 0; i < ctx.getChildCount(); ++i) globalInfo.getNotVisitNodes().add(i);
    	}
    }
    
    @Override
    public void exitParenthesized_operation_util(Parenthesized_operation_utilContext ctx) {
    	Logger.printRuleName("exitParenthesized_operation_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo result = new WalkInfo();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = "(" + w.getCode() + ")";
    	if (valid) {
	    	while(!childrenQueue.isEmpty()) {
	    		w = childrenQueue.remove();
	    		if (!w.getValid()) valid = false;
	    		code += w.getCode();
	    	}
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.PARENTHESIZED_OPERATION);
    	result.setClassType(w.getClassType());
    	globalInfo.getCurrentQueue().add(result);
    	
    }
    
    //OBJECT ATTRIBUTE
    @Override
    public void enterObject_attribute(Object_attributeContext ctx) {
    	Logger.printRuleName("enterObject_attribute", ctx);
    }
    
    @Override
    public void exitObject_attribute(Object_attributeContext ctx) {
    	Logger.printRuleName("exitObject_attribute", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	if (!w.getCode().equals("prototype")) {
	    	globalInfo.setObjectContext(w.getClassType());
    	}
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //OBJECT ACCESS
    @Override
    public void enterObject_access(Object_accessContext ctx) {
    	Logger.printRuleName("enterObject_access", ctx);
    }
    
    @Override
    public void exitObject_access(Object_accessContext ctx) {
    	Logger.printRuleName("exitObject_access", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	//nodeType is inherited from child
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //COMPARISON OPERATOR
    @Override
    public void enterComparison_operator(Comparison_operatorContext ctx) {
    	//Logger.printRuleName("enterComparison_operator", ctx);
        check(ctx);
    }
    
    @Override
    public void exitComparison_operator(Comparison_operatorContext ctx) {
    	//Logger.printRuleName("exitComparison_operator", ctx);
    }
    
    //AND OPERATOR
    @Override
    public void enterAnd_operator(And_operatorContext ctx) {
    	//Logger.printRuleName("enterAnd_operator", ctx);
    	 check(ctx);
    }
    
    @Override
    public void exitAnd_operator(And_operatorContext ctx) {
    	//Logger.printRuleName("And_operator", ctx);
    }
    
    //ARITHMETIC OPERATOR
    @Override
    public void enterArithmetic_operator(Arithmetic_operatorContext ctx) {
    	//Logger.printRuleName("enterComparison_operator", ctx);
        check(ctx);
    }
    
    @Override
    public void exitArithmetic_operator(Arithmetic_operatorContext ctx) {
    	//Logger.printRuleName("exitComparison_operator", ctx);
    }
    
    //GLORIFIED ARITHMETIC OPERATOR
    @Override
    public void enterGlorified_arithmetic_operator(Glorified_arithmetic_operatorContext ctx) {
    	//Logger.printRuleName("enterArithmetic_operator", ctx);
        check(ctx);
    }
    
    @Override
    public void exitGlorified_arithmetic_operator(Glorified_arithmetic_operatorContext ctx) {
    	//Logger.printRuleName("exitArithmetic_operator", ctx);
    }
    
    //SIGN OPERATOR
    @Override
    public void enterSign_operator(Sign_operatorContext ctx) {
    	//Logger.printRuleName("enterComparison_operator", ctx);
        check(ctx);
    }
    
    @Override
    public void exitSign_operator(Sign_operatorContext ctx) {
    	//Logger.printRuleName("exitComparison_operator", ctx);
    }
    
    
    /********************/
    /*       ATOMS      */
    /********************/
    
    //JSON
    @Override
    public void enterJson(JsonContext ctx) {
    	Logger.printRuleName("enterJson", ctx);
    	globalInfo.increaseindentationLevel();
    }
    
    @Override
    public void exitJson(JsonContext ctx) {
    	Logger.printRuleName("exitJson", ctx);	
    	
    	
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	
    	String indentation = globalInfo.getIndentation();
    	ClassInfo json = new ClassInfo();
    	json.setParentClasses(new ClassParents("Object"));
    	
    	String code = "{\n";
    	//we only accept the object if at least one property is true
    	Boolean valid = false;
    	
    	while (!childrenQueue.isEmpty()) {
			WalkInfo w = childrenQueue.remove();
			if (w.getValid()) {
				valid = true;
				code += indentation + w.getCode() + ",\n";
				json.addProperty(w.getClassType());
			}
		}
    	if (code.length() > 4) code = trim(code, 2) + "\n";
    	globalInfo.decreaseindentationLevel();
    	code += globalInfo.getIndentation() + "}";
    	
    	WalkInfo result = new WalkInfo();
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.JSON);
    	result.setClassType(json);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //JSON CONTENTS
    @Override
    public void enterJson_contents(Json_contentsContext ctx) {
    	Logger.printRuleName("enterJson_contents", ctx);
    	//no need to visit the property name nor the colon
    	for (int i = 0; i < 2; ++i) globalInfo.getNotVisitNodes().add(i);
    }
    
    @Override
    public void exitJson_contents(Json_contentsContext ctx) {
    	Logger.printRuleName("exitJson_contents", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	
    	WalkInfo result = new WalkInfo();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String propertyName = ctx.getChild(0).getText();
    	String code = propertyName + " : " + w.getCode();
    	
    	if (valid) {
    		ClassInfo prop = w.getClassType();
    		prop.setName(propertyName);
    		result.setClassType(prop);
    	}
    	else if (w.getNodeType().equals(GlobalInfo.nodeTypes.CODE_BLOCK)) {
    		valid = true;
    		ClassInfo prop = new ClassInfo();
    		prop.setName(propertyName);
    		prop.setParentClasses(new ClassParents("Object"));
    		result.setClassType(prop);
    	}
    	
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(GlobalInfo.nodeTypes.JSON_CONTENTS);
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //ARRAY
    @Override
    public void enterArray(ArrayContext ctx) {
    	Logger.printRuleName("enterArray", ctx);
    }
    
    @Override
    public void exitArray(ArrayContext ctx) {
    	Logger.printRuleName("exitArray", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.ARRAY);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //CODE BLOCK
    @Override
    public void enterCode_block(Code_blockContext ctx) {
    	Logger.printRuleName("enterCode_block", ctx);
    }
    
    @Override
    public void exitCode_block(Code_blockContext ctx) {
    	Logger.printRuleName("exitCode_block", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.CODE_BLOCK);
    	globalInfo.getCurrentQueue().add(w);
    }

    //NEW OBJECT DECLARATION
    @Override
    public void enterNew_object_declaration(New_object_declarationContext ctx) {
    	Logger.printRuleName("enterNew_object_declaration", ctx);
    }
    
    @Override
    public void exitNew_object_declaration(New_object_declarationContext ctx) {
    	Logger.printRuleName("exitNew_object_declaration", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	w.setNodeType(GlobalInfo.nodeTypes.NEW_OBJECT);
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //NEW OBJECT DECLARATION UTIL
    @Override
    public void enterNew_object_declaration_util(New_object_declaration_utilContext ctx) {
    	Logger.printRuleName("enterNew_object_declaration_util", ctx);
    }
    
    @Override
    public void exitNew_object_declaration_util(New_object_declaration_utilContext ctx) {
    	Logger.printRuleName("exitNew_object_declaration_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = "new " + w.getCode();
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.NEW_OBJECT);
    	result.setClassType(w.getClassType());
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //NUMBER
    @Override
    public void enterNumber(NumberContext ctx) {
    	Logger.printRuleName("enterNumber", ctx);
    	check(ctx);
    }
    
    @Override
    public void exitNumber(NumberContext ctx) {
    	Logger.printRuleName("exitInteger", ctx);
    }
    
    //IDENTIFIER
    @Override
    public void enterIdentifier(IdentifierContext ctx) {
    	Logger.printRuleName("enterIdentifier", ctx);
    }
    
    @Override
    public void exitIdentifier(IdentifierContext ctx) {
    	Logger.printRuleName("exitIdentifier", ctx);
    	WalkInfo w = globalInfo.getChildrenQueue().remove();
    	globalInfo.getCurrentQueue().add(w);
    }
    
    //STRING
    @Override
    public void enterString(StringContext ctx) {
    	Logger.printRuleName("enterString", ctx);
        check(ctx);
    }
    
    @Override
    public void exitString(StringContext ctx) {
    	Logger.printRuleName("exitString", ctx);
    }

    //REGULAR EXPRESSION
    @Override
    public void enterRegular_expression(Regular_expressionContext ctx) {
    	Logger.printRuleName("enterRegular_expression", ctx);
    	check(ctx);
    }
    
    @Override
    public void exitRegular_expression(Regular_expressionContext ctx) {
    	Logger.printRuleName("exitRegular_expression", ctx);
    }
    
    
    /****************/
    /*  ATOM UTILS  */
    /****************/
    
    //ARRAY UTIL
    @Override
    public void enterArray_util(Array_utilContext ctx) {
    	Logger.printRuleName("enterArray_util", ctx);
    }
    
    @Override
    public void exitArray_util(Array_utilContext ctx) {
    	Logger.printRuleName("exitArray_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	Boolean valid = true;
    	String code = "";
    	WalkInfo w = null;
    	if (!childrenQueue.isEmpty()) {
	    	w = childrenQueue.remove();
	    	valid = w.getValid();
	    	code = "[" + w.getCode() + "]";
    	}
    	else {
    		code = "[]";
    	}
    	WalkInfo result = new WalkInfo(valid, code);
    	result.setNodeType(GlobalInfo.nodeTypes.ARRAY);
		List<String> parentClassList = new ArrayList<String>();
		parentClassList.add("Array");
    	if (w == null || code.equals("[]")) {
    		result.setClassType(new ClassInfo("", parentClassList, Arrays.asList(new ClassInfo[]{new ClassInfo("[]", new ClassParents("Joker"))})));
    	}
    	else if (valid) {
    		result.setClassType(new ClassInfo("", parentClassList, Arrays.asList(new ClassInfo[]{new ClassInfo("[]", w.getClassType().getParentClasses(), w.getClassType().getProperties())})));
    	}
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //CODE BLOCK UTIL CONTENTS
    @Override
    public void enterCode_block_util_contents(Code_block_util_contentsContext ctx) {
    	Logger.printRuleName("enterCode_block_util_contents", ctx);
    }
    
    @Override
    public void exitCode_block_util_contents(Code_block_util_contentsContext ctx) {
    	Logger.printRuleName("exitCode_block_util_contents", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo result = new WalkInfo();
    	if (!childrenQueue.isEmpty()) result = childrenQueue.remove();
    	if (!childrenQueue.isEmpty()) result.setCode(result.getCode() + ";");
    	if (result.getNodeType() != null && result.getNodeType().equals(GlobalInfo.nodeTypes.FUNCTION_DECLARATION)) {
    		ClassInfo function = result.getClassType();
    		if (function != null && function.getName() != null && !function.getName().equals("")) {
    			globalInfo.getCurrentScope().addSymbol(function);
    		}
    	}
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //CODE BLOCK UTIL
    @Override
    public void enterCode_block_util(Code_block_utilContext ctx) {
    	Logger.printRuleName("enterCode_block_util", ctx);
    	globalInfo.increaseindentationLevel();
    }
    
    @Override
    public void exitCode_block_util(Code_block_utilContext ctx) {
    	Logger.printRuleName("exitCode_block_util", ctx);
    	globalInfo.decreaseindentationLevel();
    	String indent = globalInfo.getIndentation();
    	String code = "{\n";
    	Boolean valid = false;
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo w = null;
    	while(!childrenQueue.isEmpty()) {
    		w = childrenQueue.remove();
    		if (w.getValid()) {
				code += globalInfo.getChildIndentation() + w.getCode() + "\n";
				valid = true;
    		}
    	}
    	code += indent + "}";
    	WalkInfo result = new WalkInfo(valid, code);
    	//TODO the type corresponds to the last instructions that doesn't return undefined, we'll suppose it's the last for the moment
    	//anyways Snap doesn't use such garbage currently
    	result.setNodeType(GlobalInfo.nodeTypes.CODE_BLOCK);
    	if (w != null) result.setClassType(w.getClassType());
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //IDENTIFIER UTIL
    @Override
    public void enterIdentifier_util(Identifier_utilContext ctx) {
    	Logger.printRuleName("enterIdentifier_util", ctx);
    	globalInfo.setCurrentAccess(null);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	walkRule(ctx.getChild(0));
    	WalkInfo w = childrenQueue.peek();
    	if (w.getValid()) {
    		globalInfo.getNotVisitNodes().add(0);
    		globalInfo.setCurrentAccess(w.getClassType());
    	}
    	else {
    		for (int i = 0; i < ctx.getChildCount(); ++i) globalInfo.getNotVisitNodes().add(i);
    	}
    }
    
    @Override
    public void exitIdentifier_util(Identifier_utilContext ctx) {
    	Logger.printRuleName("exitIdentifier_util", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	WalkInfo result = new WalkInfo();
    	WalkInfo w = childrenQueue.remove();
    	Boolean valid = w.getValid();
    	String code = w.getCode();
    	result.setAlternateCode(w.getCode());
    	if (valid) {
	    	while(!childrenQueue.isEmpty()) {
	    		w = childrenQueue.remove();
	    		if (!w.getValid()) valid = false;
	    		code += w.getCode();
	    	}
    	}
    	result.setValid(valid);
    	result.setCode(code);
    	result.setNodeType(w.getNodeType());
    	result.setClassType(w.getClassType());
    	globalInfo.getCurrentQueue().add(result);
    }
    
    //ID
    @Override
    public void enterId(IdContext ctx) {
    	Logger.printRuleName("enterId", ctx);
    	check(ctx);
    }
    
    @Override
    public void exitId(IdContext ctx) {
    	Logger.printRuleName("exitId", ctx);
    }
    
    //BOOLEAN
    @Override
    public void enterBoolean(BooleanContext ctx) {
    	Logger.printRuleName("enterBoolean", ctx);
    	check(ctx);
    }
    
    @Override
    public void exitBoolean(BooleanContext ctx) {
    	Logger.printRuleName("exitBoolean", ctx);
    }
  
    //parameters
    @Override
    public void enterParameters(ParametersContext ctx) {
    	Logger.printRuleName("enterParameters", ctx);
    }
    
    @Override
    public void exitParameters(ParametersContext ctx) {
    	Logger.printRuleName("exitParameters", ctx);
    	Queue<WalkInfo> childrenQueue = globalInfo.getChildrenQueue();
    	String code = "";
    	String fullCode = "";
    	Boolean valid = true;
    	WalkInfo w = null;
    	while(!childrenQueue.isEmpty()) {
    		w = childrenQueue.remove();
    		if (w.getValid()) {
    			code += w.getCode();
    			if (code.length() > 0) code += ", ";
    		}
    		else valid = false;
    		fullCode += w.getCode() + ", ";
    	}
    	if (code.length() > 0) code = trim(code, 2);
    	if (fullCode.length() > 0) fullCode = trim(fullCode, 2);
    	WalkInfo result = new WalkInfo(valid, code, fullCode);
    	result.setClassType(w.getClassType());
    	result.setNodeType(GlobalInfo.nodeTypes.PARAMETERS);
    	globalInfo.getCurrentQueue().add(result);
    }
    
}