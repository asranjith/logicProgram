package programmingpractice;

public class PowerOfn {
public static int pow(int b,int p) {
	int res=1;
	for(int i=1;i<=p;i++) {
		res=res*b;
	}
	return res;
}
public static void main(String[] args) {
	//System.out.println(pow(10,4));
	int res=(int)Math.pow(10, 4);
	System.out.println(res);
}
}
