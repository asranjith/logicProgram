package patternProgram;

public class NumberProblem4 {
	public static void print(int row,int column) {              //  3  3  3
		int x=row;                                              //  2  2  2
		for(int j=1;j<=row;j++) {                               //  1  1  1

			for(int i=1;i<=column;i++) {
				
				System.out.print(x+"  ");
				
			}
		   x--;
			System.out.println();
		   
		}
	}
	public static void main(String[] args) {
		print(3,3);
	}
}
