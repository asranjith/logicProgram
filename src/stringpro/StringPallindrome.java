package stringpro;

import java.util.Scanner;

public class StringPallindrome {
  public static void main(String[] args) {
	  Scanner sca=new Scanner(System.in);
		System.out.println("Enter the String Value");
		String s=sca.nextLine();
		if(isPallindrome(s))
		   System.out.println("pallindrome");
		   else
			   System.out.println("not pallindrome");
}
  public static boolean isPallindrome(String s) {
	int i=0,j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j))
			return false;
		i++;
		j--;
		
	}
	return true;
  }
}
