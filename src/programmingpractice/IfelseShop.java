package programmingpractice;

import java.util.Scanner;

public class IfelseShop {
 public static double discount(int a) {
	 System.out.println("one product cost 100");
	 if((a*100)>=1000) {
		 System.out.println("you got 10% discount");
		 return a*100*0.9;
	 }
	 else;{
		 System.out.println("no discount");
		 return a*100;
	 }
 }
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	boolean g;
	do {
	System.out.println("ENTER THE NUMBER OF PRODUCT YOU BOUGHT : ");
    int b=s.nextInt();
    System.out.println(discount(b));
    System.out.println("do you want to check the price again :");
    g=s.nextBoolean();
	}
	while(g);{
		System.out.println("thank you for visiting our shop");
		s.close();
	}
 }
}
