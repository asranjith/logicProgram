package stringpro;

import java.util.Scanner;

public class CountOfCharactersInAString {
  public static void main(String[] args) {
	Scanner sca=new Scanner(System.in);
	System.out.println("Enter the String Value");
	String s=sca.nextLine();
	int ac=0,dc=0,sc=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
			ac++;
		}
		else if (ch>='0'&& ch<='9') {
			dc++;
		}
		else {
			sc++;
		}
	}
	System.out.println("PrimeNumberwithIn of alphabet:"+ac);
	System.out.println("PrimeNumberwithIn of decimal:"+dc);
	System.out.println("PrimeNumberwithIn of Special Character:"+sc);
	sca.close();
}
 
}
