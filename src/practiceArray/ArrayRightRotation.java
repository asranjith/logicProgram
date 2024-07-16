package practiceArray;

//import java.util.Arrays;

public class ArrayRightRotation {
  public static int[] rotate(int[] num) {
	  print(num);
	  int last=num[num.length-1];
	  for(int i=num.length-1;i>=1;i--) {
		  num[i]=num[i-1];
	  }
	  num[0]=last;
	  print(num);
	 // System.out.println(Arrays.toString(num));
	  return num;
  }
  public static void print(int [] num) {
	  System.out.println("print array");
	  for(int i=0;i<=num.length-1;i++) {
		  System.out.print(num[i]+" ");
	  } 
	  System.out.println();
  }
  public static void main(String[] args) {
	  int [] num= {1,2,3,4,5};
	  rotate(num);
	//System.out.println(rotate(num));
	//  int [] res=rotate(num);
	//  for(int i=0;i<=res.length-1;i++) {
	//	  System.out.print(res[i]+" ");
	//  }
}
}
