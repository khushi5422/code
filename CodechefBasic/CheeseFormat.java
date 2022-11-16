package CodechefBasic;

import java.util.Scanner;

public class CheeseFormat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 0; i <= test_case; i++) {
            System.out.println("Enter a value: ");
            int a = s.nextInt();
            System.out.println("Enter b value: ");
            int b = s.nextInt();
            if (a + b < 3) {
                System.out.println("Bullet");
            } else if (3 <= a + b && a + b <= 10) {
                System.out.println("Blitz");
            } else if (11 <= a + b && a + b <= 60) {
                System.out.println("Rapid");
            } else if (60 < a + b) {
                System.out.println("Classical");
            }


        }

    }
}
