package Day26;

public class NullPointerCaseStudy {

	public static void main(String[] args) {
		ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
		Company cp = new Company("YaHo co., Ltd.", ci);
		Friend frn = new Friend("LEE SU", cp);
		showCompAddr(frn);
	}

	public static void showCompAddr(Friend frn) {
		String addr = null;
		System.out.println(addr);
		if (frn != null) {
			Company com = frn.getCmp();
			System.out.println(com);
			if (com != null) {
				ContInfo info = com.getcInfo();
				System.out.println(info);
				if (info != null)
					addr = info.getAdrs();
			}
		}
		System.out.println(addr);
//		if (addr != null)
//			System.out.println(addr);
//		else {
//			System.out.println("주소 정보가 없습니다.");
//		}
	}

}
