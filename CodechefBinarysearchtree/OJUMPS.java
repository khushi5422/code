package CodechefBinarysearchtree;

import java.util.Scanner;

public class OJUMPS {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            long n = s.nextLong();
            if(n%3==0){
                System.out.println("Yes");
            } else if (n%2 !=0 && n%3==1) {
                System.out.println("yes");
            }else System.out.println("no");
        }
        catch(Exception e){

        }


    }
}
