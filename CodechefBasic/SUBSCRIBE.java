package CodechefBasic;

import java.util.Scanner;

public class SUBSCRIBE {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for(int i = 1 ; i <=test_case;i++){
                int a = s.nextInt();
                if(a>30){
                    System.out.println("YES");
                }else System.out.println("NO");
            }
        }
        catch(Exception e){

        }


    }
}
