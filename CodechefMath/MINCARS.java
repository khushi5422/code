package CodechefMath;

import java.util.Scanner;

public class MINCARS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int car = s.nextInt();
            int count = 1;
            for (int j = 1; j < car; j++) {
                    int carcount = Math.abs(4-car);
                    if (carcount <= 4) {
                        count = 1;
                    } else count++;
                }

            System.out.println(count);

        }

    }
}
