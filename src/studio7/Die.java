package studio7;

class Die {
	private int sides;

	public Die() {
		this.sides = 6;
	}

	public Die(int sides) {
		this.sides = sides;
	}

	public int Roll() {
		return (int) Math.round(Math.random() * (this.sides - 1) + 1);
	}
	
	public static void main (String args[]) {
		Die d1 = new Die();
		Die d2 = new Die(100);
		
		System.out.println(d1.Roll());
		System.out.println(d2.Roll());
	} 

}