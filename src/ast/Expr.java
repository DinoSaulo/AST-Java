package ast;

public abstract class Expr {
	abstract String posFixa();
	abstract int accept(EvalVisitor e);
}
