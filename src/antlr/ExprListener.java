// Generated from Expr.g4 by ANTLR 4.8

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Import}
	 * labeled alternative in {@link ExprParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport(ExprParser.ImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link ExprParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport(ExprParser.ImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dataset}
	 * labeled alternative in {@link ExprParser#ds}.
	 * @param ctx the parse tree
	 */
	void enterDataset(ExprParser.DatasetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dataset}
	 * labeled alternative in {@link ExprParser#ds}.
	 * @param ctx the parse tree
	 */
	void exitDataset(ExprParser.DatasetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Filename}
	 * labeled alternative in {@link ExprParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFilename(ExprParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Filename}
	 * labeled alternative in {@link ExprParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFilename(ExprParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExprParser.VariableContext ctx);
}