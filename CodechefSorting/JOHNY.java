package CodechefSorting;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class JOHNY {

//    public static int search(int arr[], int size, int key) {
//        int start = 0;
//        int end = arr.length - 1;
//        int mid = (start + end) / 2;
//        while (start <= end) {
//            if (key == arr[mid]) {
//                return mid;
//            } else if (key > arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//            mid = (start + end) / 2;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(in);
            System.out.println("test cases");
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                System.out.println("size");
                int Size = s.nextInt();
                int arr[] = new int[Size];
                for (int j = 1; j <= arr.length; j++) {
                    System.out.println("element " + j);
                    arr[j] = s.nextInt();
                }
                System.out.println("key");
                int key = s.nextInt();
                Arrays.sort(arr);
                System.out.println(" original sorted array is " + arr);
//                int answer = search(arr, arr.length, key);
//                System.out.println("answer" + answer);

            }
        } catch (Exception e) {

        }


    }
}
