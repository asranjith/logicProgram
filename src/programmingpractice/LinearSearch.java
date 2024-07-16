package programmingpractice;

public class LinearSearch {
public static int check(int []num,int n) {
	for(int i=0;i<=num.length-1;i++) {
		if(num[i]==n) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	int num[]= {1,2,3,4,5,6,7};
	System.out.println(check(num,5));
}
}
