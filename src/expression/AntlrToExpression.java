package expression;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.DatasetContext;
import antlr.ExprParser.FilenameContext;
import antlr.ExprParser.ImportContext;
import antlr.ExprParser.VariableContext;

public class AntlrToExpression extends ExprBaseVisitor<Import> {

	@Override
	public Import visitImport(ImportContext ctx) {
		// TODO Auto-generated method stub
		return super.visitImport(ctx);
	}

	@Override
	public Import visitDataset(DatasetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDataset(ctx);
	}

	@Override
	public Import visitFilename(FilenameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFilename(ctx);
	}

	@Override
	public Import visitVariable(VariableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariable(ctx);
	}

}
