package ast;

public class SubExpr extends Expr {
	Expr e1, e2;
	public SubExpr(Expr e1, Expr e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	public String toString() {
		return "( " + this.e1 + " - "  + this.e2 + " )";
	}
	
	public int eval() {
		return e1.eval() - e2.eval();
	}
	
	String posFixa() {
		return "" + e1.posFixa() + e2.posFixa() + " - ";
	}
}
