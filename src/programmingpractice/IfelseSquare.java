package programmingpractice;

import java.util.Scanner;

public class IfelseSquare {
public static String check(int length,int breath) {
	if(length==breath) {
		return "square";
	}
		else;{
			return "rectangle";
		}
}
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	boolean b;
	do {
	System.out.println("ENTER THE LENGTH OF THE FIGURE: ");
	int n=s.nextInt();
	System.out.println("ENTER THE BREATH OF THE FIGURE: ");
	int m =s.nextInt();
	System.out.println(check(n,m));
	System.out.println("do you want to check another figure");
	b=s.nextBoolean();
	}
	while(b);{
		System.out.println("thank you for visiting our website");
		s.close();
	}
}
		

}
