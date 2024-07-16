package sorting;

public class BubbleSorting {
public static int[] sort(int[]num){
	for(int j=1;j<=num.length;j++) {
	for(int i=0;i<=num.length-2;i++) {
		if(num[i]>num[i+1]) {
			int temp=num[i];
			num[i]=num[i+1];
			num[i+1]=temp;
		}
	}
}
	printArray(num);
	return num;
}
public static void printArray(int []num) {
	for(int i=0;i<=num.length-1;i++) {
		System.out.print(num[i]);
	}
	System.out.println();
}
public static void main(String[] args) {
	int num[]= {4,1,5,3,2};
	sort(num);
}
}