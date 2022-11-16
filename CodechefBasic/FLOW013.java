package CodechefBasic;

import java.util.Scanner;

public class FLOW013 {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for(int i = 1 ; i <=test_case;i++){
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                int sum = a+b+c;
                if(sum==180){
                    System.out.println("YES");
                }else System.out.println("NO");
            }
        }
        catch(Exception e){

        }


    }
}
