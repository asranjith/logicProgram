package programmingpractice;
import java.util.Scanner;
public class Factorial {
 public static long fact(int n) {
	 long f=1;
	 for(int i=n;i>=1;i--) {
		 f=f*i;
	 }
	 return f;
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n=sc.nextInt();
	System.out.println(Factorial.fact(n));
	sc.close();
}
}
