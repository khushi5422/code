package ArrayCodechef;

import java.util.Scanner;

public class dominating {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[a[i]]++;
            }
            for (int i = 0; i < n + 1; i++) {
                System.out.println(b[i]);
            }
            int max = b[1];
            int flag = 1;
            for (int i = 2; i < n + 1; i++) {
                if (max < b[i]) {
                    max = b[i];
                    flag = 1;
                } else if (max == b[i])
                    flag = 0;
            }
            if (flag == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
