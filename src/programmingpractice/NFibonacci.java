package programmingpractice;
// 0 1 1 2 3 5 8 13 21
public class NFibonacci {
public static void print(int n) {
	int n1=0;
	int n2=1;
	if(n==1) {
		System.out.println(n1);
	}
	else;{
		System.out.print(n1+" "+n2);
		for(int i=1;i<=n-2;i++) {
		int n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
	}
}
public static void main(String []args) {
	print(5);
}	
}