package CodechefBasic;

import java.util.Scanner;

public class CHOPRT {
    public static void main(String[] args) {
            try{
                Scanner s = new Scanner(System.in);
                int test_case = s.nextInt();
                for(int i = 1 ; i <=test_case;i++){
                    int a =s.nextInt();
                    int b = s.nextInt();
                    if(a>b){
                        System.out.println(">");
                    } else if (a<b) {
                        System.out.println("<");
                    }else
                        System.out.println("=");
                }
            }catch(Exception e){
            }
    }
}
