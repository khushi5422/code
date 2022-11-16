package CodechefBasic;

import java.util.Scanner;

public class Lastlevel {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        System.out.println("test:");
        int test = s.nextInt();
        int x= s.nextInt();
        int y= s.nextInt();
        int z= s.nextInt();
        int d= x/3;
        int res=(y*x) + (d*z);
        int res1= res-z;
        if(d==0){
            System.out.println(y*x);
        }else if(x%3==0){
            System.out.println(res1);
        }else{
            System.out.println(res);
        }
        }
    }

