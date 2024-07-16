package stringpro;

public class StringCount {
public static void main(String[] args) {
	String s="my country name is india";
	String arr[]=s.split(" ");
	int a=0;
	for(String i:arr) {
		a++;
	}
	System.out.println(a);
}
}
