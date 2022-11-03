package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/**
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	public Fraction Reciprocal() {
		Fraction X = new Fraction (denominator, numerator);
		return X;
		
		
	}
	public Fraction Multiply(Fraction y) {
		int x = numerator * y.numerator;
		int a = denominator * y.denominator;
		Fraction Z = new Fraction(x,a);
		return Z;
			
	}

	public Fraction Simplify() {
		numerator = numerator / ( gcd(numerator, denominator));
		denominator = denominator / ( gcd(numerator, denominator));
		
		Fraction B = new Fraction (numerator, denominator);
		return B;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
