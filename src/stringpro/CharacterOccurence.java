package stringpro;

import java.util.HashMap;

public class CharacterOccurence {
   public static void main(String[] args) {
	String s="my name is ASR";
	String t=s.toLowerCase();
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	for(int i=0;i<t.length();i++) {
		char ch=t.charAt(i);
	
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}
		else {
			map.put(ch, 1);
		}
	}
	for (Character k : map.keySet()) {
		System.out.println(k+"===>"+map.get(k));
		
	}
	System.out.println(map.remove('z'));
}
}
