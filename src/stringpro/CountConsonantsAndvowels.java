package stringpro;

import java.util.Scanner;

public class CountConsonantsAndvowels {
  public static void main(String[] args) {
	  Scanner sca=new Scanner(System.in);
		System.out.println("Enter the String Value");
		String s=sca.nextLine();
		int v=0,c=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&& ch<='Z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					v++;
				}
				else
					c++;
			}
		}
		System.out.println("vowels :"+v);
		System.out.println("character :"+c);
}
}
