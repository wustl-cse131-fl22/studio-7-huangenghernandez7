package studio7;

public class HockeyPlayer {
	private String name;
	private String shootDirection;
	private int jerseyNumber;
	private int gameGoals;
	private int gameAssists;
	private int totalGoals;
	private int totalAssists;
	private int points;
	private int numOfGamesPlayed;
	
	public HockeyPlayer(String name, String shootDirection, int jerseyNumber, int totalGoals, int totalAssists, int numOfGamesPlayed) {
		this.name = name;
		this.shootDirection = shootDirection;
		this.jerseyNumber = jerseyNumber;
		this.totalGoals = totalGoals;
		this.totalAssists = totalAssists;
		this.numOfGamesPlayed = numOfGamesPlayed;	
		this.points = totalGoals + totalAssists;
	}
	
	public void completedAGame(int gameGoals, int gameAssists) {
		this.numOfGamesPlayed++;
		this.totalGoals += gameGoals;
		this.totalAssists += gameAssists;
		this.points += gameGoals + gameAssists;
		System.out.println("\nCongrats on finishing another game! Here are your new stats: \n");
		System.out.println(toString());
	}
	
	public int getPoints() {
		return this.totalGoals + this.totalAssists;
	}
	
	public int getNumOfGamesPlayed() {
		return this.numOfGamesPlayed;
	}
	
	public int getTotalGoals() {
		return this.totalGoals;
	}
	
	public int getTotalAssists() {
		return this.totalAssists;
	}
	
	public String toString() {
		return ("Player Name: "+this.name+"\nJersey Number: "+this.jerseyNumber+"\nShoot Direction: "+this.shootDirection+"\nNumber of Games Played: "+this.numOfGamesPlayed+"\nTotal Goals: "+this.totalGoals+"\nTotal Assists: "+this.totalAssists+"\nTotal Points: "+this.points);
	}
	
	public static void main(String args[]) {
		HockeyPlayer H1 = new HockeyPlayer("Grace", "right", 16, 50, 20, 30);
		System.out.println(H1);
		
		H1.completedAGame(10, 5);
		H1.completedAGame(10, 10);
	}

}
