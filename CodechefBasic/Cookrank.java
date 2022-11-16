package CodechefBasic;

import java.util.Scanner;

public class Cookrank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of competitor");
        int test_case = s.nextInt();
        int[] score = new int[5];
        for (int i = 1; i <= test_case; i++) {
//            int count = 0;
//            for (int j = 0; j < score.length; j++) {
//                System.out.print("enter the score:");
//                score[j] = s.nextInt();
//            }
//            for (int p = 0; p < score.length; p++) {
//                if (score[p] == 1) {
//                    count++;
//                }
//            }
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int e = s.nextInt();
            int count = a+b+c+d+e;

            System.out.println(count);
            if (count == 1) {
                System.out.println("Beginners");
            } else if (count == 2) {
                System.out.println("Junior developer");
            } else if (count == 3) {
                System.out.println("Middle developer");
            } else if (count == 4) {
                System.out.println("Senior developer");
            } else if (count == 5) {
                System.out.println("Hacker");
            } else if (count == 6) {
                System.out.println("Jeff Dean");
            }

        }
    }

}
