package programmingpractice;

import java.util.Scanner;

public class EvenOrOdd {
public static boolean check(int n) {
	if(n%2==0) 
		return true;
	else 
		return false;
	
}
public static void print(boolean b) {
	if(b == true)
		System.out.println("EVEN");
	else
		System.out.println("ODD");
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter any number :");
	int num=sc.nextInt();
	print(check(num));
	sc.close();
}
}
