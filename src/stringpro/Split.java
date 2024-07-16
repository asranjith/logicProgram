package stringpro;

public class Split {
public static String print(String a) {
	String s="";
	String b[]=a.split("p");
	for(int i=0;i<b.length;i++) {
	s=s.concat(b[i]);	
	}
	return s;
}
public static void main(String[] args) {
	String a="empty";
	System.out.println(print(a));
}
}
