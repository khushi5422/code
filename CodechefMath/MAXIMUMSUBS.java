package CodechefMath;

import java.util.Scanner;

public class MAXIMUMSUBS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int X = s.nextInt();
            int time = X * 60;
//            int submittion = time - 5;
            System.out.println(time / 30);
        }

    }
}
