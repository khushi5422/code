package CodechefBasic;

import java.util.Scanner;

public class Vaccation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 0 ; i <=test_case;i++){
            System.out.println("Enter time taken by Plane");
            int a = s.nextInt();
            System.out.println("Enter time taken by Bus");
            int b = s.nextInt();
            System.out.println("Enter time taken by Train");
            int c = s.nextInt();
            int Planebus = a+b;
            if(Planebus> c){
                System.out.println("Train");
            } else if (Planebus<c) {
                System.out.println("Planebus");
            } else if (Planebus==c) {
                System.out.println("Equals");
            }
        }

    }
}
