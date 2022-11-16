package CodechefBasic;

import java.util.Scanner;

public class Shoes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("test case");
        int test = s.nextInt();
        for(int i = 0 ; i<=test;i++){
            System.out.println("friends");
            int friends = s.nextInt();
            int requirement = 2*friends;
            System.out.println("left shoe");
            int left = s.nextInt();
            System.out.println(requirement-left);
        }
    }
}
