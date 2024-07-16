package practiceArray;

public class ToStoreChar {
  public static void print(char[] c) {
	  for(int j=0;j<c.length;j++) {
		 System.out.print(c[j]+" ");
	  }
  }
  public static void main(String[] args) {
	  char c[]=new char[24];
	  int b=97;
	  for(int i=0;i<c.length;i++) {
		c[i]=(char)b;
		b++;
	
	  }
	print(c);
}
}
