package programmingpractice;

public class PalindromeInRangeOfNumber {
 public static void check(int s,int e) {
	 for(int i=s;i<=e;i++) {
    if(palindrome(i)==true)  
    System.out.println(i+" ");
	 }
  
 }
 public static boolean palindrome(int n) {
	 int ori=n;
	 int rev=0;
	 while(n>0) {
		 int rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
	 }
	 if(rev==ori) {
		 return true;
	 }
	 else
		 return false;
 }
 public static void main(String[] args) {
	check(10,1000);
}
}
