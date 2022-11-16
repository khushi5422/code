package CodechefBasic;

import java.util.Scanner;

public class Cab {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Cabcase = s.nextInt();
        for (int i = 1; i <= Cabcase; i++) {
            int First = s.nextInt();
            int Second = s.nextInt();
            if (First > Second) {
                System.out.println("second");
            } else if (First < Second) {
                System.out.println("first");
            } else {
                System.out.println("Any both are same");
            }
        }

    }
}
