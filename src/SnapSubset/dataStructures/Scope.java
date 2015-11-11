/* 
 *  
 * Scope.java
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

import java.util.HashMap;
import java.util.Map;

import utils.Logger;


public class Scope {

	/* private attributes */
	
	private Map<String, ClassInfo> symbols;
	private Scope parent;
	
	
	/* constructors */
	
	public Scope() {
		this.symbols = new HashMap<String, ClassInfo>();
		this.parent = null;
	}
	
	
	/* public methods */
	
	public Boolean isTopLevelContext() {
		return (parent == null);
	}
	
	public void printVisibilityContext() {
		Logger.print("VISIBILITY CONTEXT");
		for (String varName : symbols.keySet()) {
			Logger.print(varName);
		}
	}
	
	public void addSymbol(ClassInfo symbol) {
		if (symbol == null || symbol.equals("")) {
			System.out.println("addSymbol: null or empty symbol");
			System.exit(1);
		}
		this.symbols.put(symbol.getName(), symbol);
	}
	
	public void removeSymbol(String symbol) {
		if (symbol == null || symbol.equals("")) {
			System.out.println("removeSymbol: null or empty symbol");
			System.exit(1);
		}
		symbols.remove(symbol);
	}
	
	public Boolean symbolExists(String symbol) {
		if (symbol == null || symbol.equals("")) {
			System.out.println("symbolExists: null or empty symbol");
			System.exit(1);
		}
		return this.symbols.containsKey(symbol);
	}
	
	public Boolean symbolExistsInStack(String symbol) {
		if (symbol == null || symbol.equals("")) {
			System.out.println("symbolExistsInStack: null or empty symbol");
			System.exit(1);
		}
		Scope ctx = this;
		while (ctx != null) {
			if (ctx.symbolExists(symbol)) return true;
			ctx = ctx.getParentScope();
		}
		return false;
	}
	
	public ClassInfo getSymbol(String symbol) {
		if (symbol == null || symbol.equals("")) {
			System.out.println("getSymbol: null or empty symbol");
			System.exit(1);
		}
		return this.symbols.get(symbol);
	}
	
	public ClassInfo getSymbolOfStack(String symbol) {
		if (symbol == null || symbol.equals("")) {
			System.out.println("getSymbolOfStack: null or empty symbol");
			System.exit(1);
		}
		Scope ctx = this;
		while (ctx != null) {
			ClassInfo ci = ctx.getSymbol(symbol);
			if (ci != null) return ci;
			ctx = ctx.getParentScope();
		}
		return null;
	}
	
	
	/* set & get */
	
	public Map<String, ClassInfo> getSymbols() {
		return symbols;
	}

	public void setSymbols(Map<String, ClassInfo> symbols) {
		this.symbols = symbols;
	}

	public Scope getParentScope() {
		return parent;
	}

	public void setParentScope(Scope parent) {
		this.parent = parent;
	}
	
}