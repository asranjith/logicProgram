package digitProgram;


import java.util.Scanner;

public class DuplicateDigitInNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
	    int cnt[] = new int[10];
	    while(n>0) {
	    	int rem=n%10;
	    	cnt[rem]++;
	    	n=n/10;
	    }
	    for(int i=0;i<cnt.length;i++) {
	    	if(cnt[i]>1) {
	    		System.out.println("false");
	    	}
	    }
	    System.out.println("true");
	    sc.close();
	    
      
	}
}
