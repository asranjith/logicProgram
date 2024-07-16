package programmingpractice;

import java.util.Scanner;

public class IfelseGrading {
public static char grade(int a) {
	if(a<25) {
		return 'F';
	}
	else if(a>=25 && a<45) {
		return 'E';
	}
	else if(a>=45 && a<50) {
		return 'D';
	}
	else if(a>=50 && a<60) {
		return 'C';
	}
	else if(a>=60 && a<80) {
		return 'B';
	}
	else if(a>=80 && a<=100) {
		return 'A';
	}
	else;{
		return 'X';
	}
}
public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	boolean g;
	do {
	System.out.println("enter your mark");
	int b=s.nextInt();
	if(grade(b)== 'X') {
		System.out.println("enter the valid mark");
	}
	System.out.println(grade(b));
	System.out.println("do you want to check your grade again");
	g=s.nextBoolean();
	}
	while(g); {
		System.out.println("all the best for your future");
		s.close();
	}
}
}
