package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	
	public Fraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public int getNum() {
		return this.numerator;
	}
	
	public int getDenom() {
		return this.denominator;
	}
	
	public Fraction getSum(Fraction f1) {
		if (this.getDenom() != f1.getDenom()) {
			int tempDenom = this.getDenom() * f1.getDenom();
			int tempNum1 = this.getNum() * f1.getDenom();
			int tempNum2 = f1.getNum() * this.getDenom();
			
			Fraction temp = new Fraction(tempNum1 + tempNum2, tempDenom);
			return temp;
		}
		Fraction temp = new Fraction(this.getNum() + f1.getNum(), this.getDenom());
		return temp;
	}
	
	public Fraction getProduct(Fraction f1) {
		Fraction temp = new Fraction(this.getNum() * f1.getNum(), this.getDenom() * f1.getDenom());
		return temp;
	}
	
	public Fraction reciprocal() {
		Fraction temp = new Fraction(this.getDenom(), this.getNum());
		return temp;
	}
	
	public void setFraction(int num, int denom) {
		this.numerator = num;
		this.denominator = denom;
	}
	
	public void simplify() {
		int gcd = gcd(this.numerator, this.denominator);
		this.setFraction(this.getNum()/gcd, this.getDenom()/gcd);
	}
	
	public String toString() {
		return (this.getNum() + "/" + this.getDenom());
	}
	
	public static int gcd(int p, int q) {
		
		if(p % q == 0) {
			return q;
		}
		else {
			return gcd(q, p%q);
		}
	
	}
	
	public static void main (String args[]) {
		Fraction f1 = new Fraction(1, 7);
		Fraction f2 = new Fraction(3, 7);
		Fraction f3 = new Fraction(1, 9);
		Fraction f6 = new Fraction(2, 4);
		
		Fraction f4 = f1.getSum(f2);
		Fraction f5 = f1.getSum(f3);
		
		System.out.println(f4);
		System.out.println(f5);
		f6.simplify();
		System.out.println("Test: " + f6);
	
		
	}
}