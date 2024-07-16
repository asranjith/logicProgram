package programmingpractice;



public class FibanacciSeries {
public static void print(int n) {
	int n1=0;
	int n2=1;
	int n3=0;
	for(int i=0;i<=n;i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n2-n1);
	}
	
}
public static void main(String[] args) {
	print(5);
}
}
