/* 
 *  
 * CheckListener.java
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

import org.antlr.v4.runtime.ParserRuleContext;

import utils.Logger;
import antlr4.SnapGrammarBaseListener;
import antlr4.SnapGrammarParser.And_operatorContext;
import antlr4.SnapGrammarParser.Arithmetic_operatorContext;
import antlr4.SnapGrammarParser.Assign_operatorContext;
import antlr4.SnapGrammarParser.BooleanContext;
import antlr4.SnapGrammarParser.Comparison_operatorContext;
import antlr4.SnapGrammarParser.End_statementContext;
import antlr4.SnapGrammarParser.Glorified_arithmetic_operatorContext;
import antlr4.SnapGrammarParser.IdContext;
import antlr4.SnapGrammarParser.NumberContext;
import antlr4.SnapGrammarParser.Or_operatorContext;
import antlr4.SnapGrammarParser.Regular_expressionContext;
import antlr4.SnapGrammarParser.Sign_operatorContext;
import antlr4.SnapGrammarParser.StringContext;
import dataStructures.ClassInfo;
import dataStructures.ClassParents;
import dataStructures.GlobalInfo;
import dataStructures.WalkInfo;


public class CheckListener extends SnapGrammarBaseListener {
	
	/* private attributes */
	
	private GlobalInfo globalInfo = GlobalInfo.getInstance();
	
	
	/* private methods */
	
	private void add(ParserRuleContext ctx, Boolean valid, Boolean print, GlobalInfo.nodeTypes type, ClassInfo value) {
		if (print) Logger.printValue(ctx, valid.toString() + " : " + ctx.getText());
		WalkInfo info = new WalkInfo(valid, ctx.getText());
		info.setClassType(value);
		info.setNodeType(type);
		globalInfo.getCurrentQueue().add(info);
	}
	
	private void checkAndAdd(ParserRuleContext ctx, Boolean valid, Boolean print, GlobalInfo.nodeTypes type) {
		Boolean symbolExists;
		String code = ctx.getText();
		ClassInfo classType = null;
		if (globalInfo.getObjectContext() != null) {
			ClassInfo ci = globalInfo.getObjectContext();
			globalInfo.setPreviousObjectContext(ci);
			
			// this avoids issues in case one Class overwrites a method from it's parent
			if (globalInfo.isTopLevel() && globalInfo.isLeftSideAssignment()) classType = ci.getPropertyExcludeParents(code);
			// we supose that inside a function we don't modify the prototype
			else {
				classType = ci.getProperty(code);
				//example: Object.keys will fail because we're checking
				//the function, instead of the class
				if (classType == null) {
					if (globalInfo.getClasses().get(ci.getName()) != null) {
						ci = globalInfo.getClasses().get(ci.getName());
						globalInfo.setPreviousObjectContext(ci);
						classType = ci.getProperty(code);
					}
				}
			}
			
			if (code.equals("prototype")) {
				symbolExists = true;
				classType = ci;
			}
			else if (classType != null) {
				symbolExists = true;
			}
			else symbolExists = false;
			
			//TODO add property automatically to all objects instead of hardcoding it here
			if (classType == null && code.equals("constructor")) {
				symbolExists = true;
				// TODO eventually we may need to support multiple parentClass
				ClassInfo constructor = globalInfo.getDocumentScope().getSymbolOfStack(globalInfo.getObjectContext().getParentClasses().getAllParents().get(0));
				globalInfo.setObjectContext(constructor);
				classType = constructor;
			}
		}
		else {
			classType = globalInfo.getCurrentScope().getSymbolOfStack(code);
			if (classType == null) classType = globalInfo.getClasses().get(code);			
			symbolExists = classType != null;
		}
		if (classType != null) classType = new ClassInfo(classType);
		add(ctx, symbolExists, print, type, classType);
	}
	
	
	/* public methods*/
	
	/*********************/
    /*  STATEMENT UTILS  */
    /*********************/
	
	//ASSIGN OPERATOR
    @Override
    public void enterAssign_operator(Assign_operatorContext ctx) {
    	Logger.printRuleName("enterAssign_operatorCheck", ctx);
    	add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitAssign_operator(Assign_operatorContext ctx) {
    	Logger.printRuleName("exitAssign_operatorCheck", ctx);
    }
    
    //END STATEMENT
    @Override
    public void enterEnd_statement(End_statementContext ctx) {
    	//Logger.printRuleName("enterEnd_statementCheck", ctx);
        add(ctx, true, false, GlobalInfo.nodeTypes.END_STATEMENT, null);
    }
    
    @Override
    public void exitEnd_statement(End_statementContext ctx) {
    	//Logger.printRuleName("exitEnd_statementCheck", ctx);
    }
    
    
    /********************/
    /*   INSTRUCTIONS   */
    /********************/
        
    //ARITHMETIC OPERATOR
    @Override
    public void enterArithmetic_operator(Arithmetic_operatorContext ctx) {
    	Logger.printRuleName("enterCheckArithmetic_operator", ctx);
        add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitArithmetic_operator(Arithmetic_operatorContext ctx) {
    	Logger.printRuleName("exitCheckArithmetic_operator", ctx);
    }
    
    //GLORIFIED ARITHMETIC OPERATOR
    @Override
    public void enterGlorified_arithmetic_operator(Glorified_arithmetic_operatorContext ctx) {
    	Logger.printRuleName("enterCheckArithmetic_operator", ctx);
        add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitGlorified_arithmetic_operator(Glorified_arithmetic_operatorContext ctx) {
    	Logger.printRuleName("exitCheckArithmetic_operator", ctx);
    }
    
    //AND OPERATOR
    @Override
    public void enterAnd_operator(And_operatorContext ctx) {
    	Logger.printRuleName("enterCheckAnd_operator", ctx);
    	add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitAnd_operator(And_operatorContext ctx) {
    	Logger.printRuleName("exitCheckAnd_operator", ctx);
    }
    
    //OR OPERATOR
    @Override
    public void enterOr_operator(Or_operatorContext ctx) {
    	Logger.printRuleName("enterCheckOr_operator", ctx);
    	add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitOr_operator(Or_operatorContext ctx) {
    	Logger.printRuleName("exitCheckOr_operator", ctx);
    }
    
    //COMPARISON OPERATOR
    @Override
    public void enterComparison_operator(Comparison_operatorContext ctx) {
    	Logger.printRuleName("enterCheckComparison_operator", ctx);
    	add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitComparison_operator(Comparison_operatorContext ctx) {
    	Logger.printRuleName("exitCheckComparison_operator", ctx);
    }
    
    //SIGN OPERATOR
    @Override
    public void enterSign_operator(Sign_operatorContext ctx) {
    	Logger.printRuleName("enterCheckComparison_operator", ctx);
    	add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitSign_operator(Sign_operatorContext ctx) {
    	Logger.printRuleName("exitCheckComparison_operator", ctx);
    }
    
    
    /********************/
    /*       ATOMS      */
    /********************/
    
    //IDENTIFIER
    @Override
    public void enterId(IdContext ctx) {
    	Logger.printRuleName("enterCheckId", ctx);
        checkAndAdd(ctx, true, true, GlobalInfo.nodeTypes.IDENTIFIER);
    }
    
    @Override
    public void exitId(IdContext ctx) {
        Logger.printRuleName("exitCheckId", ctx);
    }
    
    //REGULAR EXPRESSION
    @Override
    public void enterRegular_expression(Regular_expressionContext ctx) {
    	Logger.printRuleName("enterCheckRegular_expression", ctx);
        add(ctx, true, true, null, null);
    }
    
    @Override
    public void exitRegular_expression(Regular_expressionContext ctx) {
    	Logger.printRuleName("exitCheckRegular_expression", ctx);
    }

    //STRING
    @Override
    public void enterString(StringContext ctx) {
    	Logger.printRuleName("enterCheckString", ctx);
        add(ctx, true, true, GlobalInfo.nodeTypes.STRING, new ClassInfo("", new ClassParents("String")));
    }
    
    @Override
    public void exitString(StringContext ctx) {
    	Logger.printRuleName("exitCheckString", ctx);
    }
    
    //NUMBER
    @Override
    public void enterNumber(NumberContext ctx) {
    	Logger.printRuleName("enterCheckNumber", ctx);
        add(ctx, true, true, GlobalInfo.nodeTypes.NUMBER, new ClassInfo("", new ClassParents("Number")));
    }
    
    @Override
    public void exitNumber(NumberContext ctx) {
    	Logger.printRuleName("exitCheckNumber", ctx);
    }
    
    //BOOLEAN
    @Override
    public void enterBoolean(BooleanContext ctx) {
    	Logger.printRuleName("enterCheckBoolean", ctx);
        add(ctx, true, true, GlobalInfo.nodeTypes.BOOLEAN, new ClassInfo("", new ClassParents("Boolean")));
    }
    
    @Override
    public void exitBoolean(BooleanContext ctx) {
    	Logger.printRuleName("exitCheckBoolean", ctx);
    }
    
}