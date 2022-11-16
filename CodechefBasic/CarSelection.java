package CodechefBasic;

import java.util.Scanner;

public class CarSelection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 0 ; i <=test_case;i++){
            System.out.println("Enter the car 1 Diesel car economy:");
            int x1 = s.nextInt();
            System.out.println("Enter the car 2  Petrol economy:");
            int x2 = s.nextInt();
            System.out.println("Enter the Diesel Prize:");
            int x3 = s.nextInt();
            System.out.println("Enter the Petrol Price:");
            int x4 = s.nextInt();
             int car1cost = x1/x3;
             int car2cost = x2/x4;
             if(car1cost<car2cost){
                 System.out.println("car1 ");
             } else if (car1cost>car2cost) {
                 System.out.println("car2");
             } else if (car1cost==car2cost) {
                 System.out.println("Equal");
             }
        }

    }
}
