package Day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("PINEAPPLE");
		list.add("ROB");

		Comparator<String>cmp = new Comparator<String>() {
			
			@Override
		public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
			
		Collections.sort(list, cmp);
		System.out.println(list);
		
		
		}
	}

}