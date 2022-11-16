package CodechefBasic;

import java.util.Scanner;

public class IncreaseIQ {
    public static void main(String[] args) {
        int Einstein = 170;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the present IQ value:");
        int IQ = s.nextInt();
        if ((IQ + 7) > Einstein) {
            System.out.println("Yes you can compete");
        } else {
            System.out.println("No you cant play more music");
        }
    }
}
