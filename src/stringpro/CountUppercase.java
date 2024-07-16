package stringpro;

import java.util.Scanner;
                                                           /*     Character     */
public class CountUppercase {                                  // isLetter()
   public static void check(String str) {                      // isDigit()  
	   int uppercase=0;                                        // isWhitespace() 
	   int lowercase=0;                                        // isUppercase()
	   int number=0;                                           // isLowercase()
	   int special=0;                                          // toUpperCase()
	   for(int i=0;i<str.length();i++) {                       // toLowerCase()
		   if(str.charAt(i)>='A' && str.charAt(i)<='Z'){       // toString() 
			   uppercase++; 
		   }
		   else if(Character.isLowerCase(str.charAt(i))){
			   lowercase++;
		   }
	   
	   else if(Character.isDigit(str.charAt(i))) {
		   number++;
	   }
	   else {
		   special++;
	   }
	   }
	   System.out.println("upper case: "+uppercase);
	   System.out.println("lower case: "+lowercase);
	   System.out.println("numeric: "+number);
	   System.out.println("Special: "+special);
   }
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter email");
		String str=sc.next();
		check(str);
	}
}
	
}
