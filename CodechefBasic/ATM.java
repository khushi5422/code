package CodechefBasic;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double bankcharge = 0.5;
        int Balance = 200;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the amount");
        int Amount = s.nextInt();
        if (Amount % 5 == 0) {
            if(Amount+bankcharge < Balance){
                System.out.println(Balance-(Amount+bankcharge));
            }
            else {
                System.out.println("insufficient Balance");
            }
            }
        else {
            System.out.println(Balance);
        }
    }
}
