package Day19;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) { // 프로그램 실행시 #은 비어있는곳을 없애주고 0은 비어있는곳은 0으로 채워준다
		DecimalFormat f1 = new DecimalFormat("#");
		DecimalFormat f2 = new DecimalFormat("0000000000.00");
		DecimalFormat f3 = new DecimalFormat("#.000");

		DecimalFormat f4 = new DecimalFormat("#,###.##");
		DecimalFormat f5 = new DecimalFormat("-#.#");
		DecimalFormat f6 = new DecimalFormat("#.##E00");
		DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
		DecimalFormat f8 = new DecimalFormat("#.;00%");
		DecimalFormat f9 = new DecimalFormat("\u00A4###,###.##");

		System.out.println(f1.format(1234567.890));
		System.out.println(f2.format(1234567.890));
		System.out.println(f3.format(1234567.890));
		System.out.println(f4.format(1234567.890));
		System.out.println(f5.format(1234567.890));
		System.out.println(f6.format(1234567.890));
		System.out.println(f7.format(1234567.890));
		System.out.println(f7.format(-1234567.890));
		System.out.println(f8.format(1234567.890));
		System.out.println(f9.format(123456.7890));

	}

}
