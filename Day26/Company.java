package Day26;

public class Company {

	private String cName;
	ContInfo cInfo;

	public Company(String cname, ContInfo cinfo) {
		this.cName = cname;
		this.cInfo = cinfo;

	}

	public String getcName() {
		return cName;
	}

	public ContInfo getcInfo() {
		return cInfo;
	}

}
