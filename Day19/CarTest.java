package Day19;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {

	public static void main(String[] args) {
		Car MyCar = new Car("그랜저");
		Car YourCar = new Car("그랜저");
		String x;
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");

		String cm = "그랜저";
		String dr = "홍길동";

//		System.out.println(MyCar + "," + YourCar);

		if (MyCar.equals(YourCar)) {
//			System.out.println("내 자동차는 [" + MyCar.toString() + "], 너 자동차는 [" + YourCar.toString() + "]로 모델이 같다");
			System.out.println("자동차 모델이 둘 다 " + MyCar.toString() + "로 동일하다");
		} else {
			System.out.println("내 자동차는 [" + MyCar.toString() + "], 너 자동차는 [" + YourCar.toString() + "]로 모델이 다르다");
		}

		try {
			d = sdf1.parse("06-07-2017");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String s = MessageFormat.format("자동차 모델=[{1}], 운전자[{0}]", dr, cm);

		x = "날짜: " + sdf1.format(d) + ", " + s;
		System.out.println(x);

		System.out.println();
		tokenizer(x, " " + "=" + "[" + "],");

	}

	public static void tokenizer(String s, String d) {
		StringTokenizer st = new StringTokenizer(s, d);
//		StringTokenizer st = new StringTokenizer(s, "[=],()");

//		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
