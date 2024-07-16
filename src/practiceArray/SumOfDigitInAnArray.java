package practiceArray;

public class SumOfDigitInAnArray {
  public static void main(String[] args) {
	int a[]= {11,12,13,14};
	for(int i=0;i<a.length;i++) {
		int b=a[i];
		int sum=0;
		while(b>0) {
			int rem=b%10;
			sum=sum+rem;
			b=b/10;
		}
		a[i]=sum;
		
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
