package CodechefBinarysearchtree;

import java.util.Scanner;

public class TRICOIN {
    public static void main(String[] args) {
                int n = 3;
                int count = 0;
                for(int j = 1 ; j<=n ; j++){
                    n = n-j;
                    count++;
                    System.out.println(count);
                }
                System.out.println("Final"+ count);
    }
}
