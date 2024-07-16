package stringpro;

public class StringReversing
{
    //Function to reverse words in a given string.
    public static String reverseWords(String s)
    {
     String e="";
     String tr[]=s.split("[.]");
     for(int i=tr.length-1;i>0;i--){
        e= e+tr[i]+".";
     }
     return e+tr[0];
    }
    public static void main(String []args){
        String S = "i.like.this.program.very.much" ;
        System.out.println(reverseWords(S));
    }
}
