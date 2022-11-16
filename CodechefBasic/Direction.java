package CodechefBasic;

import java.util.Scanner;

public class Direction {
    private static String findDirection(int count) {
        String d = "";
        if (count > 0) {
            if (count % 4 == 0)
                d = "North";
            else if (count % 4 == 1)
                d = "East";
            else if (count % 4 == 2)
                d = "South";
            else if (count % 4 == 3)
                d = "West";
        }
        return d;

    }

    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the test cases");
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                System.out.println("Enter the time");
                int count = s.nextInt();
                System.out.println(findDirection(count));
            }
        } catch (Exception e) {
        }


    }
}
