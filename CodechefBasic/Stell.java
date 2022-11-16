package CodechefBasic;

import java.util.Scanner;

public class Stell {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 0; i <= test_case; i++) {
            System.out.println("Enter the hardness:");
            int hardness = s.nextInt();
            System.out.println("Enter the Carbon content:");
            float carbon = s.nextFloat();
            System.out.println("Enter the Tensile strength:");
            int tensile = s.nextInt();
            Boolean con1 = hardness > 50;
            Boolean con2 = carbon < 0.7;
            Boolean con3 = tensile > 5600;
//            Grade is 10 if all three conditions are met
//            Grade is 9 if conditions (1) and (2) are met
//            Grade is 8 if conditions (2) and (3) are met
//            Grade is 7 if conditions (1) and (3) are met
//            Grade is 6 if only one condition is met
//            Grade is 5 if none of the three conditions are met
            if (con1 && con2 && con3) {
                System.out.println("Grade 10");
            } else if (con1 && con2) {
                System.out.println("Grade 9");
            } else if (con2 && con3) {
                System.out.println("Grade 8");
            } else if (con1 && con3) {
                System.out.println("Grade 7");
            } else if (con1 || con2 || con3) {
                System.out.println("Grade 6");
            } else System.out.println("Grade 5");

        }
    }
}
