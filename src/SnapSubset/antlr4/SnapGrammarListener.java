package antlr4;
// Generated from SnapGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnapGrammarParser}.
 */
public interface SnapGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#jsnap_code}.
	 * @param ctx the parse tree
	 */
	void enterJsnap_code(SnapGrammarParser.Jsnap_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#jsnap_code}.
	 * @param ctx the parse tree
	 */
	void exitJsnap_code(SnapGrammarParser.Jsnap_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(SnapGrammarParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(SnapGrammarParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SnapGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SnapGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SnapGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SnapGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIf(SnapGrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIf(SnapGrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code try_catch}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch(SnapGrammarParser.Try_catchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code try_catch}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch(SnapGrammarParser.Try_catchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SnapGrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SnapGrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFor(SnapGrammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFor(SnapGrammarParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(SnapGrammarParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(SnapGrammarParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(SnapGrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(SnapGrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do_while}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(SnapGrammarParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do_while}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(SnapGrammarParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operation}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOperation(SnapGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOperation(SnapGrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statement_list}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(SnapGrammarParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statement_list}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(SnapGrammarParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compressed_conditional}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompressed_conditional(SnapGrammarParser.Compressed_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compressed_conditional}
	 * labeled alternative in {@link SnapGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompressed_conditional(SnapGrammarParser.Compressed_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#compressed_conditional_util}.
	 * @param ctx the parse tree
	 */
	void enterCompressed_conditional_util(SnapGrammarParser.Compressed_conditional_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#compressed_conditional_util}.
	 * @param ctx the parse tree
	 */
	void exitCompressed_conditional_util(SnapGrammarParser.Compressed_conditional_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#declaration_util}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_util(SnapGrammarParser.Declaration_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#declaration_util}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_util(SnapGrammarParser.Declaration_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#var_assign_util}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign_util(SnapGrammarParser.Var_assign_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#var_assign_util}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign_util(SnapGrammarParser.Var_assign_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#assign_util}.
	 * @param ctx the parse tree
	 */
	void enterAssign_util(SnapGrammarParser.Assign_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#assign_util}.
	 * @param ctx the parse tree
	 */
	void exitAssign_util(SnapGrammarParser.Assign_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#if_util}.
	 * @param ctx the parse tree
	 */
	void enterIf_util(SnapGrammarParser.If_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#if_util}.
	 * @param ctx the parse tree
	 */
	void exitIf_util(SnapGrammarParser.If_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#try_catch_util}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_util(SnapGrammarParser.Try_catch_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#try_catch_util}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_util(SnapGrammarParser.Try_catch_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#try_catch_util_try}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_util_try(SnapGrammarParser.Try_catch_util_tryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#try_catch_util_try}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_util_try(SnapGrammarParser.Try_catch_util_tryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#try_catch_util_catch}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_util_catch(SnapGrammarParser.Try_catch_util_catchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#try_catch_util_catch}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_util_catch(SnapGrammarParser.Try_catch_util_catchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#try_catch_util_finally}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_util_finally(SnapGrammarParser.Try_catch_util_finallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#try_catch_util_finally}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_util_finally(SnapGrammarParser.Try_catch_util_finallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#return_util}.
	 * @param ctx the parse tree
	 */
	void enterReturn_util(SnapGrammarParser.Return_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#return_util}.
	 * @param ctx the parse tree
	 */
	void exitReturn_util(SnapGrammarParser.Return_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#for_util}.
	 * @param ctx the parse tree
	 */
	void enterFor_util(SnapGrammarParser.For_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#for_util}.
	 * @param ctx the parse tree
	 */
	void exitFor_util(SnapGrammarParser.For_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#for_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFor_parameters(SnapGrammarParser.For_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#for_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFor_parameters(SnapGrammarParser.For_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#function_declaration_util}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_util(SnapGrammarParser.Function_declaration_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#function_declaration_util}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_util(SnapGrammarParser.Function_declaration_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#switch_util}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_util(SnapGrammarParser.Switch_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#switch_util}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_util(SnapGrammarParser.Switch_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(SnapGrammarParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(SnapGrammarParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(SnapGrammarParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(SnapGrammarParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_default(SnapGrammarParser.Switch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_default(SnapGrammarParser.Switch_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#while_util}.
	 * @param ctx the parse tree
	 */
	void enterWhile_util(SnapGrammarParser.While_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#while_util}.
	 * @param ctx the parse tree
	 */
	void exitWhile_util(SnapGrammarParser.While_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#do_while_util}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_util(SnapGrammarParser.Do_while_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#do_while_util}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_util(SnapGrammarParser.Do_while_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#statement_list_util}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list_util(SnapGrammarParser.Statement_list_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#statement_list_util}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list_util(SnapGrammarParser.Statement_list_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssign_operator(SnapGrammarParser.Assign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#assign_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssign_operator(SnapGrammarParser.Assign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(SnapGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(SnapGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNegation(SnapGrammarParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNegation(SnapGrammarParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code break}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBreak(SnapGrammarParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code break}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBreak(SnapGrammarParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmetic_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operation(SnapGrammarParser.Arithmetic_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmetic_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operation(SnapGrammarParser.Arithmetic_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceof_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstanceof_operation(SnapGrammarParser.Instanceof_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceof_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstanceof_operation(SnapGrammarParser.Instanceof_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prexment_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPrexment_operation(SnapGrammarParser.Prexment_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prexment_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPrexment_operation(SnapGrammarParser.Prexment_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operation(SnapGrammarParser.Comparison_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operation(SnapGrammarParser.Comparison_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code delete}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDelete(SnapGrammarParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code delete}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDelete(SnapGrammarParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeof_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_operation(SnapGrammarParser.Typeof_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeof_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_operation(SnapGrammarParser.Typeof_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterOr_operation(SnapGrammarParser.Or_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitOr_operation(SnapGrammarParser.Or_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signed_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSigned_operation(SnapGrammarParser.Signed_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signed_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSigned_operation(SnapGrammarParser.Signed_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xment_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterXment_operation(SnapGrammarParser.Xment_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xment_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitXment_operation(SnapGrammarParser.Xment_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new_object_declaration}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNew_object_declaration(SnapGrammarParser.New_object_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new_object_declaration}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNew_object_declaration(SnapGrammarParser.New_object_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operation(SnapGrammarParser.And_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operation(SnapGrammarParser.And_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throw}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterThrow(SnapGrammarParser.ThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throw}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitThrow(SnapGrammarParser.ThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continue}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterContinue(SnapGrammarParser.ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continue}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitContinue(SnapGrammarParser.ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code object_access}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterObject_access(SnapGrammarParser.Object_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code object_access}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitObject_access(SnapGrammarParser.Object_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bit_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBit_operation(SnapGrammarParser.Bit_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bit_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBit_operation(SnapGrammarParser.Bit_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glorified_arithmetic_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterGlorified_arithmetic_operation(SnapGrammarParser.Glorified_arithmetic_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glorified_arithmetic_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitGlorified_arithmetic_operation(SnapGrammarParser.Glorified_arithmetic_operationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomic_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_operation(SnapGrammarParser.Atomic_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomic_operation}
	 * labeled alternative in {@link SnapGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_operation(SnapGrammarParser.Atomic_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#new_object_declaration_util}.
	 * @param ctx the parse tree
	 */
	void enterNew_object_declaration_util(SnapGrammarParser.New_object_declaration_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#new_object_declaration_util}.
	 * @param ctx the parse tree
	 */
	void exitNew_object_declaration_util(SnapGrammarParser.New_object_declaration_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#object_access_util}.
	 * @param ctx the parse tree
	 */
	void enterObject_access_util(SnapGrammarParser.Object_access_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#object_access_util}.
	 * @param ctx the parse tree
	 */
	void exitObject_access_util(SnapGrammarParser.Object_access_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#object_attribute}.
	 * @param ctx the parse tree
	 */
	void enterObject_attribute(SnapGrammarParser.Object_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#object_attribute}.
	 * @param ctx the parse tree
	 */
	void exitObject_attribute(SnapGrammarParser.Object_attributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link SnapGrammarParser#access_operator}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(SnapGrammarParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_access}
	 * labeled alternative in {@link SnapGrammarParser#access_operator}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(SnapGrammarParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link SnapGrammarParser#access_operator}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SnapGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call}
	 * labeled alternative in {@link SnapGrammarParser#access_operator}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SnapGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#parenthesized_operation_util}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_operation_util(SnapGrammarParser.Parenthesized_operation_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#parenthesized_operation_util}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_operation_util(SnapGrammarParser.Parenthesized_operation_utilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_declaration}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(SnapGrammarParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_declaration}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(SnapGrammarParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SnapGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SnapGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterString(SnapGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitString(SnapGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SnapGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SnapGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(SnapGrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(SnapGrammarParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code json}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterJson(SnapGrammarParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code json}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitJson(SnapGrammarParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code code_block}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(SnapGrammarParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code code_block}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(SnapGrammarParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterArray(SnapGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitArray(SnapGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regular_expression}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterRegular_expression(SnapGrammarParser.Regular_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regular_expression}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitRegular_expression(SnapGrammarParser.Regular_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesized_operation}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_operation(SnapGrammarParser.Parenthesized_operationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesized_operation}
	 * labeled alternative in {@link SnapGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_operation(SnapGrammarParser.Parenthesized_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#code_block_util}.
	 * @param ctx the parse tree
	 */
	void enterCode_block_util(SnapGrammarParser.Code_block_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#code_block_util}.
	 * @param ctx the parse tree
	 */
	void exitCode_block_util(SnapGrammarParser.Code_block_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#code_block_util_contents}.
	 * @param ctx the parse tree
	 */
	void enterCode_block_util_contents(SnapGrammarParser.Code_block_util_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#code_block_util_contents}.
	 * @param ctx the parse tree
	 */
	void exitCode_block_util_contents(SnapGrammarParser.Code_block_util_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#array_util}.
	 * @param ctx the parse tree
	 */
	void enterArray_util(SnapGrammarParser.Array_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#array_util}.
	 * @param ctx the parse tree
	 */
	void exitArray_util(SnapGrammarParser.Array_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#identifier_util}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_util(SnapGrammarParser.Identifier_utilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#identifier_util}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_util(SnapGrammarParser.Identifier_utilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(SnapGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(SnapGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#json_contents}.
	 * @param ctx the parse tree
	 */
	void enterJson_contents(SnapGrammarParser.Json_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#json_contents}.
	 * @param ctx the parse tree
	 */
	void exitJson_contents(SnapGrammarParser.Json_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#typeof_operator}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_operator(SnapGrammarParser.Typeof_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#typeof_operator}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_operator(SnapGrammarParser.Typeof_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void enterAnd_operator(SnapGrammarParser.And_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#and_operator}.
	 * @param ctx the parse tree
	 */
	void exitAnd_operator(SnapGrammarParser.And_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void enterOr_operator(SnapGrammarParser.Or_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#or_operator}.
	 * @param ctx the parse tree
	 */
	void exitOr_operator(SnapGrammarParser.Or_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#sign_operator}.
	 * @param ctx the parse tree
	 */
	void enterSign_operator(SnapGrammarParser.Sign_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#sign_operator}.
	 * @param ctx the parse tree
	 */
	void exitSign_operator(SnapGrammarParser.Sign_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(SnapGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(SnapGrammarParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#bit_operator}.
	 * @param ctx the parse tree
	 */
	void enterBit_operator(SnapGrammarParser.Bit_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#bit_operator}.
	 * @param ctx the parse tree
	 */
	void exitBit_operator(SnapGrammarParser.Bit_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#xment_operator}.
	 * @param ctx the parse tree
	 */
	void enterXment_operator(SnapGrammarParser.Xment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#xment_operator}.
	 * @param ctx the parse tree
	 */
	void exitXment_operator(SnapGrammarParser.Xment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(SnapGrammarParser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(SnapGrammarParser.Arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#glorified_arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterGlorified_arithmetic_operator(SnapGrammarParser.Glorified_arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#glorified_arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitGlorified_arithmetic_operator(SnapGrammarParser.Glorified_arithmetic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnapGrammarParser#end_statement}.
	 * @param ctx the parse tree
	 */
	void enterEnd_statement(SnapGrammarParser.End_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnapGrammarParser#end_statement}.
	 * @param ctx the parse tree
	 */
	void exitEnd_statement(SnapGrammarParser.End_statementContext ctx);
}