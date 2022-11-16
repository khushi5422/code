package CodechefBasic;

import java.util.Scanner;

public class ChefRaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 0; i <= test_case; i++) {
            System.out.println("enter the chefs race number:");
            int X = s.nextInt();
            int Y = s.nextInt();
            System.out.println("enter the rivals race number:");
            int A = s.nextInt();
            int B = s.nextInt();
            // o medels as both are same
            if (X == A && Y == B ) {
                System.out.println(" 0 medels");
            } else if (X == B && Y == A) {
                System.out.println(" 0 medels");
            // 1 medel
            } else if (X == A && Y != B  ) {
                System.out.println(" 1 medel won");
            } else if ( Y == A && X != B) {
                System.out.println("1 medel");
            } else if ( X == B && Y != A) {
                System.out.println("1 medel");
            } else if (Y == B && X != A) {
                System.out.println("1 medel");

            // 2 medels as both are  in different races
            } else if (X != A && Y != B ) {
                System.out.println(" 2 medels won");
            } else if (X != B && Y != A) {
                System.out.println("2 medels won");
        }else System.out.println("invalid entries");

        }

    }
}
