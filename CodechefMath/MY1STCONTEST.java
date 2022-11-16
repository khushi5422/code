package CodechefMath;

import java.util.Scanner;

public class MY1STCONTEST {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();
        int rating = N-A;
        int high = rating-B;
        System.out.print(rating+" ");
        System.out.print(" "+high);
    }
}
