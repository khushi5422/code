package CodechefBasic;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            System.out.println("Enter the mass");
            int mass = s.nextInt();
            System.out.println("Enter the height");
            int height = s.nextInt();
            int square = height * height;
            System.out.println(height);
            int bmi = mass / square;
            System.out.println(bmi);
//            Category 1: Underweight if BMI  18≤18
//            Category 2: Normal weight if BMI \in \{19∈{19, 20…, 24}
//            Category 3: Overweight if BMI \in \{25∈{25, 26 29}
//            Category 4: Obesity if BMI \geq 30≥30
            if (bmi <= 18) {
                System.out.println("underweight");
                System.out.println("1");
            } else if (bmi >= 19 && bmi <= 24) {
                System.out.println("Normal");
                System.out.println("2");
            } else if (bmi >= 25 && bmi <= 29) {
                System.out.println("Overweight");
                System.out.println("3");
            } else if (bmi >= 30) {
                System.out.println("Obesity");
                System.out.println("4");
            } else System.out.println("error");

        }
    }
}
