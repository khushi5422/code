package CodechefMath;

import java.util.Scanner;

public class BURGERS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            System.out.println("Pattice");
            int  A = s.nextInt();
            System.out.println("Buns");
            int  B = s.nextInt();
            if(A==B){
                System.out.println(A);
            } else if (A<B) {
                System.out.println(A);
            }else System.out.println(B);
        }

    }
}
