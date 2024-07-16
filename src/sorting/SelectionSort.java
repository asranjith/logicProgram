package sorting;

public class SelectionSort {
public static int[] sorting(int num []) {
  for(int i=0;i<=num.length-1;i++) {
	  for(int j=i+1;j<=num.length-1;j++) {
		  if(num[i]>num[j]) {
		 int swap=num[i];
		 num[i]=num[j];
		 num[j]=swap;
		  }
	  }
  }
  print(num);
  return num;
}
public static void print(int []num) {
	for(int i=0;i<=num.length-1;i++) {
		System.out.print(num[i]);
	}
	System.out.println();
}
public static void main(String[] args) {
	int num []= {2,4,6,3,1,5};
	sorting(num);
}
}
