package expression;

import java.util.ArrayList;
import java.util.List;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.DatasetContext;
import antlr.ExprParser.FilenameContext;
import antlr.ExprParser.ImportContext;
import antlr.ExprParser.VariableContext;

public class AntlrToExpression extends ExprBaseVisitor<Import> {
	
	/*
	 * Given all visit_* methods are called in a top-down fashion,
	 * order of decl'ed var's in 'vars' is identical
	 * to how they are decl'ed in input prog
	 */
	private List<String> vars; // store all var's decl'ed in prog
	private List<String> semanticErrors; // 1. dupl decl 2. ref to undecl'ed
	// semantic err's are diff from syntax err's
	
	public AntlrToExpression(List<String> semanticErrors) {
		vars = new ArrayList<>();
		this.semanticErrors = semanticErrors;
	}

	@Override
	public Import visitImport(ImportContext ctx) {
		String ds = ctx.getChild(1).getText();
		String fname = ctx.getChild(3).getText();
		String id = ctx.getChild(5).getText();
		
		vars.add(id);
		return new ImportDeclaration(ds, fname, id);
	}

	@Override
	public Import visitDataset(DatasetContext ctx) {
		String ds = ctx.getChild(0).getText();
		return new Variable(ds);
	}

	@Override
	public Import visitFilename(FilenameContext ctx) {
		String fname = ctx.getChild(0).getText();
		return new Variable(fname);
	}

	@Override
	public Import visitVariable(VariableContext ctx) {
		String id = ctx.getChild(0).getText();
		vars.add(id);
		
		return new Variable(id);
	}

}
