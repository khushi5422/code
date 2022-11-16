package CodechefBasic;

import java.util.Scanner;

public class Kattapa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of soldiers:");
        int soldiers = s.nextInt();
        int lucky = 0;
        int unlucky = 0;
        for(int i = 1; i<=soldiers ; i++) {
            System.out.println("number of weapons each soldier have");
            int weapons = s.nextInt();

            if (weapons % 2 == 0) {
                lucky++;
            } else {
                unlucky++;
            }
        }
        System.out.println(lucky);
        System.out.println(unlucky);
            if(lucky>unlucky){
                System.out.println("you can go for battle");
            }
            else {
                System.out.println("no you cant go for battle");
            }
        }

    }

