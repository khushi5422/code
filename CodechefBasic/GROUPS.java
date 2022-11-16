package CodechefBasic;

import java.util.Scanner;

public class GROUPS {
    void printRepeating(int arr[], int size) {
        int count[] = new int[size];
        int k;

        System.out.println("Repeated elements are : ");
        for (k = 0; k < size; k++) {
            if (count[arr[k]] == 1)
                System.out.print(arr[k] + " ");
            else
                count[arr[k]]++;
        }
    }

    public static void main(String[] args) {
        try {
            GROUPS groups = new GROUPS();
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int points = s.nextInt();
                int arr[] = new int[points];
                for (int j = 0; j <= args.length; j++) {
                    arr[j] = s.nextInt();
                }
                groups.printRepeating(arr, points);

            }
        } catch (Exception e) {

        }


    }
}
