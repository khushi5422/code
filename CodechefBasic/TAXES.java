package CodechefBasic;

import java.util.Scanner;

public class TAXES {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for(int i = 1 ; i <=test_case;i++){
                int a = s.nextInt();
                if(a>100){
                    System.out.println(a-10);
                }else System.out.println(a);
            }
        }
        catch(Exception e){

        }


    }
}
