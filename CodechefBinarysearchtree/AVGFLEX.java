package CodechefBinarysearchtree;

import java.util.Scanner;

public class AVGFLEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int l = 0;
            int m = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                l = 0;
                m = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] <= arr[i]) {
                        l++;
                    }
                    if (arr[j] > arr[i]) {
                        m++;
                    }
                }
                if (l > m) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

