package CodechefBasic;

import java.util.Scanner;

public class Credits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 0 ; i <=test_case;i++){
            System.out.println("Enter the credits:");
            int credits = s.nextInt();
            if(credits>65){
                System.out.println("Overload");
            } else if (credits<35) {
                System.out.println("Underload");
            }else System.out.println("Normal");
        }

    }
}
