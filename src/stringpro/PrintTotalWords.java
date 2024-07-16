package stringpro;

public class PrintTotalWords {
public static void main(String[] args) {
	String s="my country is india";
    String a[]=s.split(" ");
    for(int i=0;i<a.length;i++) {
    if(i==a.length-1)
    	System.out.println(a[a.length-1].length());
  }
}
}
