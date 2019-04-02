package ast;

public class EvalVisitor {
	
	public int visit(Expr e) {
		return e.accept(this);
	}
	public int visit(NumExpr e) {
		return e.num;
	}
	public int visit(SumExpr e) {
		int ladoEsquerdo = e.e1.accept(this);
		int ladoDireito = e.e2.accept(this);
		return ladoEsquerdo + ladoDireito;
	}
	public int visit(SubExpr e) {
		int ladoEsquerdo = e.e1.accept(this);
		int ladoDireito = e.e2.accept(this);
		return ladoEsquerdo - ladoDireito;
	}
	public int visit(DivExpr e) {
		int ladoEsquerdo = e.e1.accept(this);
		int ladoDireito = e.e2.accept(this);
		if (ladoDireito == 0) {
			throw new ArithmeticException("Divisão por zero");
		}
		return ladoEsquerdo / ladoDireito;
	}
	public int visit(MulExpr e) {
		int ladoEsquerdo = e.e1.accept(this);
		int ladoDireito = e.e2.accept(this);
		return ladoEsquerdo * ladoDireito;
	}

}
