package CodechefString;

import java.util.Scanner;

public class ALPHABET {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            String character = s.next();
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int count = 0;
                String words = s.next();
                for (int j = 0; j <= character.length(); j++) {
                    if (words.charAt(j) == character.charAt(j)) {
                        count++;
                    }
                }
                if (count != 0) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
        } catch (Exception e) {

        }


    }
}
