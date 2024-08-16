package patternProgram;

public class NumberProblem2Test {
	public static void print(int row,int column) {                  //  1  2  3
		for(int j=1;j<=row;j++) {                                   //  1  2  3
			                                                        //  1  2  3
			for(int i=1;i<=column;i++) {                            //  1  2  3
				
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		print(4,3);
	}
}
