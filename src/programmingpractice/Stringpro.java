package programmingpractice;

import java.util.Iterator;

public class Stringpro {
public static void main(String[] args) {
		String s="my nAme is java";
		for(char i='A';i<'z';i++) {
			if(s.contains(i+"")) {
				System.out.println(i+"------> "+(((s.split(i+"",-1)).length)-1));
			}
			else
			{
				System.out.println(i+"------> 0");
			}
			
		}
	} 
//	public static void main(String[] args) {
//		String s=" my name is javmabhsdgfuqkgf ";
//		
//	System.out.println(s.split("m").length);
//	for (String string : s.split("m")) {
//		System.out.println(string);
//	}
}
