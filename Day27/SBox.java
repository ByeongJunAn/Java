package Day27;

import java.io.Serializable;

public class SBox implements Serializable { // sbox는 직렬화가 가능하다.

	String s;
	transient String pw; // transient는 직렬화 제외

	public SBox(String s, String pw) {
		this.s = s;
		this.pw = pw;

	}

	public SBox(String s) {
		this.s = s;
	}

	public String get() {
		return s + " , " + pw;
	}

}
