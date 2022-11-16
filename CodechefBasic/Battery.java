package CodechefBasic;

import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("test cases:");
        int Test = s.nextInt();
        for(int i = 1; i<=Test ; i++){
            System.out.println("enter the battery :");
            int battery = s.nextInt();
            if(battery<= 15){
                System.out.println("low battery needs to be in low bateery mode");
            }
            else System.out.println("no needed its enough");
        }
    }
}
