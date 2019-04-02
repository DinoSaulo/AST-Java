package ast;

public interface IVisitor<T> { // <T> significa que ela é paramétrica
	T visit(Expr e);
	T visit(NumExpr e);
	T visit(SumExpr e);
	T visit(SubExpr e);
	T visit(DivExpr e);
	T visit(MulExpr e);
}
