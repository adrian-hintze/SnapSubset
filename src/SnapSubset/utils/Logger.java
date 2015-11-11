package utils;

import org.antlr.v4.runtime.ParserRuleContext;

import dataStructures.GlobalInfo;

public class Logger {

	/* private attributes */
	
	private static Boolean verbose = false;
	private static Boolean silent = true;
	
	
	/* public methods */
	
	public static void speak() {
		Logger.verbose = true;
	}
	
	public static void shut() {
		Logger.verbose = false;
	}
	
	public static String getIndentation(ParserRuleContext ctx) {
		String indentation = "";
		for (int i = 0; i < ctx.depth() - 1; ++i) indentation += "\t";
		return indentation;
	}
	
	public static String getIndentation(Integer level) {
		String indentation = "";
		for (int i = 0; i < level; ++i) indentation += "\t";
		return indentation;
	}
	
	public static void printRuleName(String ruleName, ParserRuleContext ctx) {
		if (!silent) System.out.println(getIndentation(ctx) + "<" + ruleName + ">");
	}
	
	public static void printValue(ParserRuleContext ctx) {
		if (!silent) System.out.println(getIndentation(ctx) + "\t" + ctx.getText());
	}
	
	public static void printValue(ParserRuleContext ctx, String customText) {
		if (!silent) System.out.println(getIndentation(ctx) + "\t" + customText);
	}
	
	public static void print(String s) {
		if (verbose && !silent) System.out.println(String.valueOf(s));
	}
	
	public static void print(GlobalInfo.nodeTypes s) {
		if (verbose && !silent) System.out.println(String.valueOf(s));
	}
	
	public static void print(Boolean s) {
		if (verbose && !silent) System.out.println(String.valueOf(s));
	}
	
	public static void print(Object s) {
		if (verbose && !silent) System.out.println(String.valueOf(s));
	}
	
	public static void forceToTalk(Object o) {
		Logger.speak();
		Logger.print(o);
		Logger.shut();
	}
	
	
	/* set & get */
	
	public static void setSilent(Boolean silent) {
		Logger.silent = silent;
	}
	
}
