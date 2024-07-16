package findDupicate;

public class PrintDuplicateNumberinAnArray {
public static void print(int []num) {
for(int i=0;i<=num.length-1;i++) {
	int c=1;
	for(int j=i+1;j<=num.length-1;j++) {
		if(num[i]==num[j]) {
			c++;
			num[j]=-1;
		}
	}
	if(num[i]!=-1 && c>1){
	 // if(num[i]!=-1 && c==1) 
	//if(num[i]!=-1)
		System.out.print(num[i]+" ");
	}
}
}
public static void main(String[] args) {
	int[]num= {5,4,6,5,7,7,8,3,9,6,4};
	print(num);
}
}
