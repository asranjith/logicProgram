package programmingpractice;

import java.util.HashMap;
import java.util.Iterator;

public class CountOccuranceUsingHashMap {
	public static void main(String[] args) {
		String s = "Ranjithas";
		s = s.toLowerCase();
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for(int i = 0;i<s.length();i++) {
//			if (map.containsKey(s.charAt(i))) {
//				map.put(s.charAt(i), map.get(s.charAt(i))+1);
//			} else {
//				map.put(s.charAt(i), 1);
//			}
//		}
//		System.out.println(map);
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
	}
}
