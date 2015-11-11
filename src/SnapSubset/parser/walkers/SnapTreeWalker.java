/* 
 *  
 * SnapTreeWalker.java
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


package parser.walkers;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import dataStructures.GlobalInfo;

public class SnapTreeWalker {
	
    public static final SnapTreeWalker DEFAULT = new SnapTreeWalker();

    public void walk(ParseTreeListener listener, ParseTree t) {
		if (t instanceof ErrorNode) {
			listener.visitErrorNode((ErrorNode)t);
			return;
		}
		else if (t instanceof TerminalNode) {
			listener.visitTerminal((TerminalNode)t);
			return;
		}
		GlobalInfo info = GlobalInfo.getInstance();
		info.setNotVisitNodes(new ArrayList<Integer>());
		RuleNode r = (RuleNode)t;
        enterRule(listener, r);
        int n = r.getChildCount();
        for (int i = 0; i<n; i++) {
        	Boolean found = false;
        	for (int j = 0; j < info.getNotVisitNodes().size(); ++j) {
        		if (info.getNotVisitNodes().get(j).equals(i)) {
        			found = true;
        			break;
        		}
        	}
        	if (!found) {
        		List<Integer> aux = info.getNotVisitNodes();
        		info.setNotVisitNodes(new ArrayList<Integer>());
        		walk(listener, r.getChild(i));
                info.setNotVisitNodes(aux);
        	}
        }
		exitRule(listener, r);
		info.setNotVisitNodes(new ArrayList<Integer>());
    }

	/**
	 * The discovery of a rule node, involves sending two events: the generic
	 * {@link ParseTreeListener#enterEveryRule} and a
	 * {@link RuleContext}-specific event. First we trigger the generic and then
	 * the rule specific. We to them in reverse order upon finishing the node.
	 */
    protected void enterRule(ParseTreeListener listener, RuleNode r) {
		GlobalInfo info = GlobalInfo.getInstance();
		info.enterRuleSetup();
    	ParserRuleContext ctx = (ParserRuleContext)r.getRuleContext();
		listener.enterEveryRule(ctx);
		ctx.enterRule(listener);
    }

    protected void exitRule(ParseTreeListener listener, RuleNode r) {
		ParserRuleContext ctx = (ParserRuleContext)r.getRuleContext();
		ctx.exitRule(listener);
		listener.exitEveryRule(ctx);
		GlobalInfo info = GlobalInfo.getInstance();
		info.exitRuleSetup();
    }
    
}