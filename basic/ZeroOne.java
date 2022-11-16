package basic;

import java.util.Scanner;

public class ZeroOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int value = s.nextInt();
        System.out.println(value^value);
    }
}
