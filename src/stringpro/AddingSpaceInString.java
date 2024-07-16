package stringpro;

import java.util.ArrayList;

public class AddingSpaceInString {
public static String addSpace(String s) {
	String a="";
	ArrayList <String> b=new ArrayList<>();
	b.add(s.substring(0,5));
	b.add(s.substring(5,7));
	b.add(s.substring(7,9));
	b.add(s.substring(9,16));
	for(String i:b) {
	 a=a+i+" ";
	}
	return a;
}
public static void main(String[] args) {
	String s="IndiaIsMyCountry";
	System.out.println(addSpace(s));
}
}
