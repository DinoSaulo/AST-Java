package ast;

public class main {

	public static void main(String[] args) {
		NumExpr num7 = new NumExpr(7);
		NumExpr num9 = new NumExpr(9);
		SumExpr num7_9 = new SumExpr(num7, num9);
		NumExpr num8 = new NumExpr(8);
		SumExpr sum79_8 = new SumExpr(num7_9, num8);
		NumExpr num2_1 = new NumExpr(2);
		NumExpr num2_2 = new NumExpr(2);
		SumExpr sum2_2 = new SumExpr(num2_1, num2_2);
		Expr ast = new SumExpr(sum79_8, sum2_2);
		
		EvalVisitor ev = new EvalVisitor();
		int resultado  = ev.visit(ast);
		System.out.println(ast + " === " + ast.posFixa() + " === " + resultado  );
		if (ast instanceof Expr) {
			System.out.println("� uma Expr");
		}
		if (ast instanceof SumExpr) {
			System.out.println("� uma SumExpr");
		}
		if (ast instanceof NumExpr) {
			System.out.println("� uma NumExpr");
		}
	}
}

class xepa {}
