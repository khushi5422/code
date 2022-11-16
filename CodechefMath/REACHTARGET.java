package CodechefMath;

import java.util.Scanner;

public class REACHTARGET {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            System.out.println("A team score");
            int X = s.nextInt();
            System.out.println("B team score");
            int Y = s.nextInt();
            int run = Math.abs(X-Y);
            System.out.println(run);
        }

    }
}
