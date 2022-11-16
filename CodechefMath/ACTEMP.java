package CodechefMath;

import java.util.Scanner;

public class ACTEMP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            int A = s.nextInt();
            int B = s.nextInt();
            int C = s.nextInt();
            if(A<=B&& B>=C){
                System.out.println("YES");
            }else System.out.println("NO");
        }

    }
}
