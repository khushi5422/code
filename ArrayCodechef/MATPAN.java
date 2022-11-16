package ArrayCodechef;

import java.util.Scanner;

public class MATPAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j <= t; j++) {
            int a[] = new int[26];
            for (int i = 0; i < 26; i++) {
                a[i] = sc.nextInt();
            }
            String s = sc.next();
            int count[] = new int[26];
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 97]++;
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] == 0) {
                    sum += a[i];
                }
            }
            System.out.println(sum);

        }
    }
}
