package CodechefBasic;

import java.util.Scanner;

public class F1Race {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("test case:");
        int Test = s.nextInt();
        for(int i = 1; i<= Test; i++){
            System.out.println("Fastest time:");
            int Fastest = s.nextInt();
            System.out.println("Chefs:");
            int chefs = s.nextInt();
            if((chefs+1.07)>=Fastest){
                System.out.println("you should win");
            }
            else System.out.println("no you can't");
        }
    }
}
