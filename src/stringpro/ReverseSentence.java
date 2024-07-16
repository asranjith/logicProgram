package stringpro;

public class ReverseSentence {
public static void main(String[] args) {
	String s="india is my country";
	String a[]=s.split(" ");
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
	}
}

