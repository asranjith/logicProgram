package programmingpractice;

import java.util.Scanner;

public class IfelseGreater {
public static int greater(int a,int b) {
	if(a>b) {
		return a;
	}
	else;{
		return b;
	}
}
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	boolean e;
	do {
	System.out.println("ENTER FIRST VALUE: ");
	int c=s.nextInt();
	System.out.println("ENTER SECOND VALUE: ");
	int d=s.nextInt();
	System.out.println("the greater number is :"+greater(c,d));
	System.out.println("do you want to check other number");
	e=s.nextBoolean();
	}
	while(e);{
		System.out.println("thank you for visiting our website");
		s.close();
	}
}
}
