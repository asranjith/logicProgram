package practiceArray;

public class LargestElementInAnArray {
  public static void main(String[] args) {
	int arr[]= {10,20,30};
	int max = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
			
		}
		
	}
	System.out.println("largest number in this array is :"+max);
}
}
