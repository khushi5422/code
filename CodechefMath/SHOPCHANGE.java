package CodechefMath;

import java.util.Scanner;

public class SHOPCHANGE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            int amount = s.nextInt();
            int retur = Math.abs(amount-100);
            System.out.println(retur);
        }

    }
}
