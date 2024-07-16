package programmingpractice;

public class FibanacciCondition {
public static void print(int n) {
	int n1=0;
	int n2=1;
	//int n3=0;
	for(int i=1;i<=n;i++) {
	
			int n3=n1+n2;
			if(n1>n) {
			break;	
			}
			System.out.println(n1+" ");
			n1=n2;
			n2=n3;
		}
	}

public static void main(String[] args) {
	print(-1);
}
}
