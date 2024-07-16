package programmingpractice;

public class PrimeCheck {
public static boolean check(int n) {
	if(n<=1) {
		return false;
	}
	else if(n==2 || n==3) {
		return true;
	}
	else if(n%2==0 || n%3==0) {
		return false;
	}
	for(int i=5;i<=Math.sqrt(n);i=i+2) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	System.out.println(check(5));
}
}
