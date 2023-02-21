package game;

import player.Player;

public class Game {
	private String name;
	private Player[] team1;
	private Player[] team2;
	private int pointsTeam1;
	private int pointsTeam2;

	public Game(String name, Player[] team1, Player[] team2) {
		this.name = name;
		this.team1 = team1;
		this.team2 = team2;
	}

	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("GAME " + name + ":");
		strb.append("\nTeam 1: ");
		for(Player player : team1){
			strb.append(player.getName());
			strb.append(", ");
		}
		strb.append("Points: " + pointsTeam1);
		strb.append("\nTeam 2: ");
		for(Player player : team2){
			strb.append(player.getName());
			strb.append(", ");
		}
		strb.append("Points: " + pointsTeam2);
		return strb.toString();
	}
}
