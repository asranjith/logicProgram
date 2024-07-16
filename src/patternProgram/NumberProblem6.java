package patternProgram;

public class NumberProblem6 {
	public static void print(int row,int column) {             //  9  8  7
		int x=row*column;                                      //  6  5  4
		for(int j=1;j<=row;j++) {                              //  3  2  1

			for(int i=1;i<=column;i++) {
				
				System.out.print(x+"  ");
				x--;
			}
		   
			System.out.println();
		   
		}
	}
	public static void main(String[] args) {
		print(3,3);
	}
}
