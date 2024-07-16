package numberpro;

public class LeapYearWithinTheRange {
	public static void main(String[] args) {
		int x=1947;
		int y=2024;
		for(int i=x;i<=y;i++)
		if(i%4==0 && i%100!=0)
			System.out.print(i+",");
		else if(i%400==0)
			System.out.print(i+",");
		
			
			
	}
}
