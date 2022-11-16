package CodechefMath;

import java.util.Scanner;

public class WATERREQ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            int N = s.nextInt();
            System.out.println(N*2);
        }

    }
}
