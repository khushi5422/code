package CodechefBasic;

import java.util.Scanner;

public class JGames {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X, Y;
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            System.out.println(" starting number:");
            X = s.nextInt();
            System.out.println(" number of moves:");
            Y = s.nextInt();
            if ((X+Y)%2==0) {
                    System.out.println("Janmansh");
                } else
                    System.out.println("Jay");

            }
        }
    }

