package Day06;

public class Switch5Demo {

	public static void main(String[] args) {
		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");
	}

	static void whoIsIt(String bio) {
		String kind = switch (bio) {
		case "호랑이":
		case "사자":
			yield "포유류";

		case "독수리":
		case "참새":
			yield "조류";

		case "고등어":
		case "연어":
			yield "어류";

		// kind = "어류"
		// break;
		default: {
			System.out.print("어이쿠!");
			yield "...";
		}
		};

		System.out.printf("%s는 %s이다. \n", bio, kind);
	}

}
