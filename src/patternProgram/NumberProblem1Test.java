package patternProgram;

public class NumberProblem1Test {
	public static void print(int row,int column) {                    //   1  1  1  1
		for(int j=1;j<=row;j++) {                                     //   2  2  2  2
			                                                          //   3  3  3  3  
			for(int i=1;i<=column;i++) {
				
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		print(3,4);
	}
}
