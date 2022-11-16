package CodechefBasic;

import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the test cases:");
        int test = s.nextInt();
        for (int i = 0; i <= test; i++) {
            System.out.println("enter the integers:");
            int F1 = s.nextInt();
            int S1 = s.nextInt();
            int T1 = s.nextInt();
            if(S1>F1&&S1<T1 || S1>T1&&S1<F1){
                System.out.println("Second Largest position"+S1);
            }else if(F1>T1&&F1<S1|| F1>S1&&F1<T1){
                System.out.println("First Position having second largest number"+F1);
            } else if (T1>S1&&T1<F1||T1<S1&&T1>F1) {
                System.out.println("Third position is having second largest number"+T1);


            } else System.out.println("invalid");
        }
    }
}