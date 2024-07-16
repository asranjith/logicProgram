package patternProgram;

public class Star {
public static void print(int row,int column) {
	for(int j=1;j<=row;j++) {
		
		for(int i=1;i<=column;i++) {
			
			System.out.print("* ");
		}
		System.out.println();
		
	}
}
public static void main(String[] args) {
	print(4,3);
}
}
