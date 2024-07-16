package programmingpractice;

public class PrintPrime {
 public static void check(int n) {
	 for(int i=2;i<=n;i++) {
		for(int j=1;j<=n/2;j++) { 
			if(n%2!=0) {
				System.out.println(n);	
			}
			
		}
	 }
 }
 public static void main(String[] args) {
	check(100);
}
}
