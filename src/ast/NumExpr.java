package ast;

public class NumExpr extends Expr {
	int num;
	public NumExpr(int n) {
		this.num = n;
	}
	public String toString() {
		return this.num+"";
	}
	public int eval() {
		return num;
	}
	String posFixa() {
		return num+"";
	}
}
