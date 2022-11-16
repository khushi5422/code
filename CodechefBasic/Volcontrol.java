package CodechefBasic;

import java.util.Scanner;

public class Volcontrol {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        System.out.println("enter the test cases");
        int Testcase = s.nextInt();
        for(int i = 1;i<=Testcase; i++){
            System.out.println("enter the initial volume");
            int initial = s.nextInt();
            System.out.println("entr the final volume");
            int finalVol = s.nextInt();
            int difference = Math.abs(finalVol-initial);
            System.out.println(difference);
        }
    }
}
