package stringpro;

public class CheckPassword {
public static void main(String[] args) {
	String s="abc@123MK";
	if(s.length()<8 || s.length()>16 ) {
			System.out.println("invalid password");
		}
	else if(Character.isDigit(s.charAt(0))) {
		System.out.println("invalid password");
	}
	int u=0;
	int v=0;
	for(int i=0;i<=s.length()-1;i++) {
		if(Character.isUpperCase(s.charAt(i))) {
			u++;
		}
		if((s.charAt(i)>=65 && s.charAt(i)<=90
			||s.charAt(i)>97 && s.charAt(i)<=122
			||s.charAt(i)>=48 && s.charAt(i)<=57)==false) {
			v++;
		}
	}
	if(u>=1 && v==1) {
		System.out.println("valid password");
	}
	System.out.println("invalid password");
	
}


}
