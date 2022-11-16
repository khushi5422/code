package ArrayCodechef;

import java.util.Arrays;
import java.util.Scanner;

public class DOMINANT2 {
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
//            System.out.println(arr[i] +" " + count);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = s.nextInt();
                }
                countFreq(arr, n);
            }
        } catch (Exception e) {

        }

    }
}
