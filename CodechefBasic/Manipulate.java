package CodechefBasic;

import java.util.Scanner;

public class Manipulate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the Test cases");
        int Testcase = s.nextInt();
        for( int i =1 ; i<= Testcase;i++){
            System.out.println("enter the 1");
            int First = s.nextInt();
            System.out.println("enter the 2");
            int second = s.nextInt();
            if(First==second || First>second){
                System.out.println("yes");
            }
            else {
                System.out.println("no U can't");
            }

        }

    }
}
