package programmingpractice;
// 0 1 1 2 3 5 8 13 21
public class NthFibonacci {
public static void print(int n) {
	int n1=0;
	int n2=1;
	if(n==1) {
		System.out.print(n1);
	}
	else;{
		for(int i=1;i<=n-2;i++) {
		int	n3=n1+n2;
		n1=n2;
		n2=n3;
		}
		System.out.print(n2);
	}
}
public static void main(String []args) {
	print(5);
}
}
