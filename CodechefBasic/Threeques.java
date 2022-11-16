package CodechefBasic;

import java.util.Scanner;

public class Threeques {
    int count = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int j = 0; j <= test_case; j++) {
            System.out.println("enter the answers A:");
            int b1 = s.nextInt();
            System.out.println("enter the answers B:");
            int b2 = s.nextInt();
            System.out.println("enter the answers C:");
            int b3 = s.nextInt();

            System.out.println("enter the question A:");
            int a1 = s.nextInt();
            System.out.println("enter the question B:");
            int a2 = s.nextInt();
            System.out.println("enter the question C:");
            int a3 = s.nextInt();

            int[] questions = {a1 + a2 + a3};
            int[] answers = {b1 + b2 + b3};

            int countQ0 = 0;
            int countQ1 = 0;
            int countA0 = 0;
            int countA1 = 0;
            for (int i = 0; i < questions.length; i++) {
                if (questions[i] == 0) {
                    countQ0++;
                } else if (questions[i] == 1) {
                    countQ1++;
                } else if (answers[i] == 0) {
                    countA0++;
                } else if (answers[i] == 1) {
                    countA1++;
                }
            }
            if (countA1 == countQ1 | countQ0 == countA0) {
                System.out.println("Pass");
            } else System.out.println("Fail");

        }

    }
}
