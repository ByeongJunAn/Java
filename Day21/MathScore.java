package Day21;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;

	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {

		return name + ", " + score;

	}

	@Override
	public int compareTo(MathScore o) {
		if (this.score - o.score == 0) {
			return 0;
		} else if (this.score - o.score < 0) {
			return -1;
		} else {
			return 1;
		}

	}

}
