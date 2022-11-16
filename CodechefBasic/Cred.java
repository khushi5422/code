package CodechefBasic;

import java.util.Scanner;

public class Cred {
    public static void main(String[] args) {
        int Cred_Amount = 750;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the cred amount");
        int Amount = s.nextInt();
        if(Amount>Cred_Amount){
            System.out.println("yes it is possible");
        } else if (Amount==Cred_Amount) {
            System.out.println("yes");
        } else {
            System.out.println("no it is not possible");
        }

    }
}
