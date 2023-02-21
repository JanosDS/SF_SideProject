package deck.card;

public enum Value {
	ACE("Ace", 1, 4),
	TWO("Two", 2, 0),
	THREE("Three", 3, 0),
	FOUR("Four", 4, 0),
	FIVE("Five", 5, 0),
	SIX("Six", 6, 0),
	SEVEN("Seven", 7, 0),
	EIGHT("Eight", 8, 0),
	NINE("Nine", 9, 0),
	TEN("Ten", 10,5),
	JACK("Jack", 11, 1),
	QUEEN("Queen", 12,2),
	KING("King", 13,3);

	private String name;
	private int value;
	private int points;

	Value(String name, int value, int points) {
		this.name = name;
		this.value = value;
		this.points = points;
	}

	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	public int getPoints(){
		return points;
	}
}