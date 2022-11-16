package CodechefBasic;

import java.util.Scanner;

public class Lazychef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 0 ; i <=test_case;i++){
            System.out.println("unit of time");
            int time = s.nextInt();
            System.out.println("unit of delay");
            int delay = s.nextInt();
            System.out.println("unit of max");
            int max = s.nextInt();
            int k = time*delay;
            int l = time+max;
            if(k<l){
                System.out.println(k);
            }else System.out.println(l);
        }

    }
}
