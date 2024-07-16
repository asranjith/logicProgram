package interview_programming;

public class SeperateCharacters {
	public static void main(String[] args) {
		String s="#a$r8nj!4h@";
		String alphabets = "";
		String special = "";
		String numbers = "";
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
				alphabets += ch;
			else if (ch>='0'&& ch<='9')
				numbers += ch;
			else
				special += ch;
		}
		System.out.println(alphabets);
		System.out.println(numbers);
		System.out.println(special);
	}
}
