package CodechefBasic;

import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int counta = 0;
            int countb = 0;
            //player 1
            System.out.println("enter the run for player A");
            int arun = s.nextInt();
            System.out.println("enter the wicket for player A");
            int awicket = s.nextInt();
            System.out.println("enter the catches for player A");
            int acatches = s.nextInt();
            //player2
            System.out.println("enter the run for player B");
            int brun = s.nextInt();
            System.out.println("enter the wicket for player B");
            int bwicket = s.nextInt();
            System.out.println("enter the catches for player B");
            int bcatches = s.nextInt();
            //comparision
            if (arun < brun) {
                countb++;
//                if (arun < brun)
            } else
                counta++;

            if (awicket < bwicket) {
                countb++;
            }
//                if (awicket > bwicket)
            else
                counta++;

            if (acatches < bcatches) {
                countb++;
//                if (acatches > bcatches)
            } else {
                counta++;
            }
            if (counta > countb) {
                System.out.println("A");
            } else System.out.println("B");

        }
    }
}