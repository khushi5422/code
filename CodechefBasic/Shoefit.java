package CodechefBasic;

import java.util.Scanner;

public class Shoefit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 0; i <= test_case; i++) {
            System.out.println("Enter the right Shoe number 0 or 1:");
            int shoe1 = s.nextInt();
            System.out.println("Enter the Left Shoe number 0 or 1:");
            int shoe2 = s.nextInt();
            System.out.println("Enter the  Shoe number 0 or 1:");
            int shoe3 = s.nextInt();
            if (shoe1 == 1 && shoe2 == 1 && shoe3 == 0|
                    shoe1 == 1 && shoe2 == 0 && shoe3 == 1|
                    shoe1 == 0 && shoe2 == 1 && shoe3 == 1|
                    shoe1 == 1 && shoe2 == 1 && shoe3 == 1) {
                System.out.println("1");
            } else System.out.println("0");
        }

    }
}
