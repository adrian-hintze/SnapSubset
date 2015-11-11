/* 
 *  
 * GlobalInfo.java
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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import utils.Logger;

public class GlobalInfo {
	
	/* private attributes */
	
	private Map<String, ClassInfo> localVars;
	private ClassInfo nextFunc;
	
	private Boolean passthrough = false;
	private Boolean leftSideAssignment = false;
	
	private static GlobalInfo instance = null;
	private Stack<Queue<WalkInfo>> contextStack;
	private Queue<WalkInfo> currentQueue;
	private Queue<WalkInfo> childrenQueue;
	private Scope documentScope;
	private Scope currentScope;
	private String result;
	private Integer indentationLevel;
	private List<Integer> notVisitNodes;
	private ClassInfo objectContext;
	private ClassInfo previousObjectContext;
	private ClassInfo leftSideObjectContext;

	private ClassInfo alternativeThis;

	private Stack<ClassInfo> objectScope;
	private ClassInfo currentAccess;

	public Map<String, ClassInfo> documentSymbols;
	private Map<String, ClassInfo> classes;
	
	  
	/* public attributes */
	
	public static enum nodeTypes {
		FUNCTION_PARAMETERS, FUNCTION_NAME, ATOMIC_OPERATION,
		OPERATION, CODE_BLOCK, IDENTIFIER,
		OBJECT_ACCESS, ASSIGN, PARENTHESIZED_OPERATION,
	    ARRAY, TRY_CATCH, FUNCTION_DECLARATION,
	    PARAMETERS, NEW_OBJECT, END_STATEMENT,
	    DECLARATION, IF, OR_OPERATION, NUMBER,
	    TRY_CATCH_UTIL_TRY, TRY_CATCH_UTIL_CATCH, TRY_CATCH_UTIL_FINALLY,
	    COMPARISON_OPERATION, RETURN, SIGNED_OPERATION,
	    THROW, ARITHMETIC_OPERATION, GLORIFIED_ARITHMETIC_OPERATION,
	    FOR, FOR_PARAMETERS, COMPRESSED_CONDITIONAL,
	    PRAGMA, AND_OPERATION, INSTANCEOF,
	    BOOLEAN, STRING, TYPEOF, ARRAY_ACCESS, FUNCTION_CALL,
	    STATEMENT_LIST, NEGATION, WHILE, DELETE, JSON, SWITCH, SWITCH_BODY, 
	    SWITCH_CASE, SWITCH_DEFAULT, BREAK, CONTINUE, JSON_CONTENTS
	}
	
	
	/* constructors */
	
	protected GlobalInfo() {
		this.localVars = new HashMap<String, ClassInfo>();
		this.contextStack = new Stack<Queue<WalkInfo>>();
		//avoid some null pointers without writing extra code
		this.contextStack.push(new LinkedList<WalkInfo>());
		this.contextStack.push(new LinkedList<WalkInfo>());
		
		this.currentQueue = new LinkedList<WalkInfo>();
		this.childrenQueue = new LinkedList<WalkInfo>();
		this.indentationLevel = 0;
		this.notVisitNodes = new ArrayList<Integer>();
		objectContext = previousObjectContext = null;
		this.objectScope = new Stack<ClassInfo>();
		objectScope.push(null);
		documentSymbols = new HashMap<String, ClassInfo>();
		classes = new HashMap<String, ClassInfo>();
		
		// internal fake classes
		classes.put("Joker", new AcceptAllClassInfo("Joker", new ClassParents("Joker")));
		classes.put("Void", new AcceptAllClassInfo("Joker", new ClassParents("Joker")));
	}

	
	/* public methods */
	
	public ClassInfo retrieveClass(String className) {
		ClassInfo result = this.classes.get(className);
		if (result == null) return result;
		return new ClassInfo(result);
	}
   
	public static GlobalInfo getInstance() {
		if (instance == null) {
			instance = new GlobalInfo();
		}
	   return instance;
	}
   
	public void increaseindentationLevel() {
		++this.indentationLevel;
	}
   
	public void decreaseindentationLevel() {
		--this.indentationLevel;
	}
   
	public String getIndentation() {
		return Logger.getIndentation(indentationLevel);
	}
   
	public String getChildIndentation() {
		return Logger.getIndentation(indentationLevel) + "\t";
	}
   
	public void stepIntoScope(Boolean increaseIndentation) {
		Scope c = new Scope();
		c.setParentScope(currentScope);
		this.currentScope = c;
		if (increaseIndentation) this.increaseindentationLevel();
	}
   
	public void stepOutOfScope(Boolean decreaseIndentation) {
		Scope c = currentScope.getParentScope();
		currentScope = c;
		if (decreaseIndentation) this.decreaseindentationLevel();
	}
   
	public void enterRuleSetup() {
		this.currentQueue = contextStack.peek();
		this.contextStack.push(new LinkedList<WalkInfo>());
		this.childrenQueue = contextStack.peek();
	}
   
	public void exitRuleSetup() {
		contextStack.pop();
		this.childrenQueue = this.currentQueue;
		contextStack.pop();
		this.currentQueue = contextStack.peek();
		contextStack.push(childrenQueue);
	}
   
	public Boolean isTopLevel() {
		return this.indentationLevel == 0;
	}
	
	
	/* set & get */
	
	public Boolean getPasstrough() {
		return this.passthrough;
	}
	
	public void setPasstrough(Boolean passthrough) {
		this.passthrough = passthrough;
	}

	public Stack<Queue<WalkInfo>> getContextStack() {
		return contextStack;
	}

	public void setContextStack(Stack<Queue<WalkInfo>> contextStack) {
		this.contextStack = contextStack;
	}

	public Queue<WalkInfo> getCurrentQueue() {
		return currentQueue;
	}

	public void setCurrentQueue(Queue<WalkInfo> currentQueue) {
		this.currentQueue = currentQueue;
	}

	public Queue<WalkInfo> getChildrenQueue() {
		return childrenQueue;
	}

	public void setChildrenQueue(Queue<WalkInfo> childrenQueue) {
		this.childrenQueue = childrenQueue;
	}

	public Scope getDocumentScope() {
		return documentScope;
	}

	public void setDocumentScope(Scope documentVisibility) {
		this.documentScope = documentVisibility;
	}

	public Scope getCurrentScope() {
		return currentScope;
	}

	public void setCurrentScope(Scope currentVisibilityContext) {
		this.currentScope = currentVisibilityContext;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getIndentationLevel() {
		return indentationLevel;
	}

	public void setIndentationLevel(Integer indentationLevel) {
		this.indentationLevel = indentationLevel;
	}

	public List<Integer> getNotVisitNodes() {
		return notVisitNodes;
	}

	public void setNotVisitNodes(List<Integer> notVisitNodes) {
		this.notVisitNodes = notVisitNodes;
	}

	public ClassInfo getObjectContext() {
		return objectContext;
	}

	public void setObjectContext(ClassInfo objectContext) {
		this.objectContext = objectContext;
	}

	public Stack<ClassInfo> getObjectScope() {
		return objectScope;
	}

	public void setObjectScope(Stack<ClassInfo> objectScope) {
		this.objectScope = objectScope;
	}

	public Map<String, ClassInfo> getDocumentSymbols() {
		return documentSymbols;
	}

	public void setDocumentSymbols(Map<String, ClassInfo> symbols) {
		this.documentSymbols = symbols;
	}
	
	public Map<String, ClassInfo> getClasses() {
		return classes;
	}

	public void setClasses(Map<String, ClassInfo> classes) {
		this.classes = classes;
	}

	public ClassInfo getCurrentAccess() {
		return currentAccess;
	}

	public void setCurrentAccess(ClassInfo currentAccess) {
		this.currentAccess = currentAccess;
	}
	
	public ClassInfo getPreviousObjectContext() {
		return previousObjectContext;
	}

	public void setPreviousObjectContext(ClassInfo previousObjectContext) {
		this.previousObjectContext = previousObjectContext;
	}
	
	public ClassInfo getLeftSideObjectContext() {
		return leftSideObjectContext;
	}

	public void setLeftSideObjectContext(ClassInfo leftSideObjectContext) {
		this.leftSideObjectContext = leftSideObjectContext;
	}
	
	public Map<String, ClassInfo> getLocalVars() {
		return localVars;
	}

	public void setLocalVars(Map<String, ClassInfo> localVars) {
		this.localVars = localVars;
	}
	
	public ClassInfo getNextFunc() {
		return nextFunc;
	}

	public void setNextFunc(ClassInfo nextFunc) {
		this.nextFunc = nextFunc;
	}
	
	public Boolean isLeftSideAssignment() {
		return leftSideAssignment;
	}

	public void setLeftSideAssignment(Boolean leftSideAssignment) {
		this.leftSideAssignment = leftSideAssignment;
	}

	public ClassInfo getAlternativeThis() {
		return alternativeThis;
	}

	public void setAlternativeThis(ClassInfo alternativeThis) {
		this.alternativeThis = alternativeThis;
	}
	
}