package Day21;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;

	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
//		return "( " +name +"," + score +")";

		return name + ", " + score;

//	    return (name, score);

	}

	@Override
	public int compareTo(EnglishScore e) {
		if (this.score - e.score == 0) {
			return 0;
		} else if (this.score - e.score < 0) {
			return -1;
		} else {
			return 1;
		}

	}

}
