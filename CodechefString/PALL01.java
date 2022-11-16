package CodechefString;

import java.util.Scanner;

public class PALL01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            int r,sum=0,temp;
            int n= s.nextInt();
            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum){
                System.out.println("wins");
            }else System.out.println("loses");
        }

    }
}
