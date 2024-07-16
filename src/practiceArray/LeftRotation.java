package practiceArray;

public class LeftRotation {
public static int[]rotate(int []num){
	int first=num[0];
	for(int i=0;i<=num.length-2;i++){
		
	  num[i]=num[i-1];	
	}
	num[num.length-1]=first;
	print(num);
	return num;
}
public static void print(int [] num) {
	for(int i=0;i<=num.length-1;i++) {
		System.out.print(num[i]+" ");
	}
	System.out.println();
	
}
public static void main(String[] args) {
	int [] num= {1,2,3,4,5};
	rotate(num);
}
}
