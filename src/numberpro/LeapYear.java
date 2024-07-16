package numberpro;

public class LeapYear {
public static void main(String[] args) {
	int y=2024;
	if(y%4==0 && y%100!=0)
		System.out.println("it is a leap year");
	else if(y%400==0)
		System.out.println("it is a leap year");
	else
		System.out.println("it is not a leap year");
		
}
}
