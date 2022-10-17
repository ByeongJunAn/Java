package Day13_02;

public class MyFriends {

	public static void main(String[] args) {
		Univfriend[] ufrns = new Univfriend[5];
		CompFriend[] cfrns = new CompFriend[5];

		int ucnt = 0;
		int ccnt = 0;

		ufrns[ucnt++] = new Univfriend("kim", "컴퓨터", "010-1234-5678");
		ufrns[ucnt++] = new Univfriend("park", "수학", "010-1111-2222");
		ufrns[ucnt++] = new Univfriend("lee", "국어", "010-9999-9999");

		cfrns[ccnt++] = new CompFriend("Kang", "R&D", "02-123-4567");
		cfrns[ccnt++] = new CompFriend("Han", "영업", "02-777-7777");
		cfrns[ccnt++] = new CompFriend("Cha", "무역부", "02-222-2222");
		cfrns[ccnt++] = new CompFriend("You", "마케팅", "02-333-3333");

		System.out.println("=============대학 동창 =============");
		for (int i = 0; i < ucnt; i++) {
			ufrns[i].showInfo();
			System.out.println();
		}

		System.out.println("=============직장 동료 =============");
		for (int i = 0; i < ccnt; i++) {
			cfrns[i].showInfo();
			System.out.println();
		}
	}

}
