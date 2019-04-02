package ast;

public class MulExpr extends Expr {
	Expr e1, e2;
	public MulExpr(Expr e1, Expr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	public String toString() {
		return "( " + this.e1 + " + "  + this.e2 + " )";
	}
	
	String posFixa() {
		return "(" + e1.posFixa() + " " + e2.posFixa() + " * )";
	}
	
	@Override
	int accept(EvalVisitor v) {
		return v.visit(this);
	}
}
