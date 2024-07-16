package findDupicate;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {
   public static void main(String[] args) {
	String st="Malayalam";
	String s= st.toLowerCase();
	HashMap<Character, Integer> h = new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(h.containsKey(ch)) {
			h.put(ch, h.get(ch)+1);
		}
		else
			h.put(ch,1);
	}
	for (Map.Entry<Character, Integer> n : h.entrySet()) {
		if(n.getValue()>1) {
			System.out.println(n.getKey()+"===>"+n.getValue());
		}
	}
}
}
