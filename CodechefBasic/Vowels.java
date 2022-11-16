package CodechefBasic;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'U' || str.charAt(i) == 'u') {
                System.out.println("Vowels");
            } else System.out.println("Constants");
        }
    }
}
