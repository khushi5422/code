package Codesignal;

public class longstring {
    String[] solution(String[] inputArray) {
        String l = ""; //full string with "-" separator

        for( String s: inputArray )
        {
            //length is first index of substring
            //if list has same size strings, add this one
            if( l.indexOf("-") == s.length() ) l += s + "-";
                //reset if list has smaller strings
            else if ( l.indexOf("-") < s.length() ) l = s + "-";
        }

        return l.split( "-" );
    }

    public static void main(String[] args) {
        String [] arr = {"aba","aa","ad", "vcd", "aba"};


    }
}