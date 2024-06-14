public class Player {
	String name;
	int score;
	public Player() {
		this.name = "No Name";
		score =0;
	}
	public Player(String name) {
		this.name = name;
		score =0;
	}
	public void addpoints(int points) {
		score+= points;
	}
	public int getPoints() {
		return score;
	}
	public void reset() {
		score =0;
		name = "";
	}
}
