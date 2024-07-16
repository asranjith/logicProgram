package interview_programming;

public class ReversingString {
	public static void main(String[] args) {
		String s = "Ram is good";
		String output = "";
		s=s.toLowerCase();
		String[] words=s.split(" ");
		for(int i= 0;i<words.length;i++) {
			for(int j = words[i].length()-1; j>=0;j-- ) {
				output += words[i].charAt(j);
			}
			output += " ";
		}
		System.out.println(output);
	}
}
