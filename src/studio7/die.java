package studio7;

class die {
	private int sides;

	public die() {
		this.sides = 6;

	}

	public die (int sides) {
				 this.sides =sides;}

	public int Roll(int sides) {
		return (int) Math.round(Math.random() * (sides - 1) + 1);
	}
}
