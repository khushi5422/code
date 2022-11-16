package CodechefBasic;

import java.util.Scanner;

public class Helpchef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            System.out.println("enter the number");
            int number = s.nextInt();
            if(number<10){
                System.out.println("Thanks for helping Chef!");
            }else System.out.println("-1");
        }

    }
}
