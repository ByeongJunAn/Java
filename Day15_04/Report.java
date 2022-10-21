package Day15_04;

public class Report implements Lower, Printable {

	String cons;

	Report(String cons) {
		this.cons = cons;
	}

	@Override
	public String getContents() {

		return cons;
	}

}
