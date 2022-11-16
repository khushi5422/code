package CodechefBasic;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int digit = s.nextInt();
        if (10 > digit) {
            System.out.println("1");
        } else if (100 > digit) {
            System.out.println("2");
        } else if (1000 > digit) {
            System.out.println("3");
        } else if (1000 < digit) {
            System.out.println("More than 3 Digit");
        }else {
        }
    }
}
