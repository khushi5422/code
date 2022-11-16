package CodechefMath;

import java.util.Scanner;

public class TCKTFINE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            int X = s.nextInt();
            int P = s.nextInt();
            int Q = s.nextInt();
            int penelty = P-Q;
            System.out.println(penelty*X);
        }

    }
}
