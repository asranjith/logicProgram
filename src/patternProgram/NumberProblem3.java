package patternProgram;

public class NumberProblem3 {
	public static void print(int row,int column) {              //  1  2  3
		int x=1;                                                //  4  5  6
		for(int j=1;j<=row;j++) {                               //  7  8  9

			for(int i=1;i<=column;i++) {
				
				System.out.print(x+"  ");
				x++;
			}
		   
			System.out.println();
		   
		}
	}
	public static void main(String[] args) {
		print(3,3);
	}
}
