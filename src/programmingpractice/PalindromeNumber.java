package programmingpractice;

public class PalindromeNumber {
public static String check(int n) {
  long ori=n;
  long rev=0l;
  while(n>0) {
	  long rem=n%10;
	  rev=rev*10+rem;
	  n=n/10;
  }
  if(rev==ori) {
	  return "it is palindrome";
  }
  else
  return "it is not palindrome";
}
public static void main(String[] args) {
	System.out.println(check(123454321));
}
}
