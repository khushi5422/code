package CodechefBasic;

import java.util.Scanner;

public class CHEFCHOCO {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for(int i = 1 ; i <=test_case;i++){
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int d = a-c;
                System.out.println(d*b);
            }
        }
        catch(Exception e){

        }


    }
}
