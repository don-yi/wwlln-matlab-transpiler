package expression;

import java.util.ArrayList;
import java.util.List;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.ProgramContext;

public class AntlrToProgram extends ExprBaseVisitor<Program>{
	
	public List<String> semanticErrors; // to be accessed by main app prog

	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog = new Program();
		
		semanticErrors = new ArrayList<>();
		// helper visitor for transf'ing each subtree into an Expr obj
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors);
		for(int i = 0; i < ctx.getChildCount() - 1; ++i)
			prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
		
		return prog;
	}
}
