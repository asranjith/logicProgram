package stringpro;

public class PrintLengthOfLastWord {
public static void main(String[] args) {
	String s="india is my country";
	String a[]=s.split(" ");
   System.out.println(a[a.length-1].length());
	
}
}
