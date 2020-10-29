// Generated from Expr.g4 by ANTLR 4.8

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Import}
	 * labeled alternative in {@link ExprParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport(ExprParser.ImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Dataset}
	 * labeled alternative in {@link ExprParser#ds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(ExprParser.DatasetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Filename}
	 * labeled alternative in {@link ExprParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(ExprParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ExprParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExprParser.VariableContext ctx);
}