package CodechefBasic;

import java.util.Scanner;

public class Matchboxdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = 0;
            int m = sc.nextInt();
            int b = sc.nextInt();
            int c = m + b;
            while (c > 0) {
                int r = c % 10;
                s = s + a[r];
                c = c / 10;
            }
            System.out.println(s);

        }
    }
}




