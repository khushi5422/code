package CodechefBasic;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int count = 0;
            System.out.println("Length of candy");
            int length = s.nextInt();
            System.out.println("K units of candy");
            int unit = s.nextInt();
            if (length == 0) {
                System.out.println("0");
            } else if (length > 0 && length < unit) {
                System.out.println("-1");
            } else {
                for (int j = 0; j < length; j++) {
                    int difference = length - unit;
                    count = difference;
                }
                System.out.println(count);
//

            }
        }

    }
}
