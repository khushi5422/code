package Binarysearchtree;

public class insertpost {
    public static int insertpostion(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return mid;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int answer = insertpostion(arr, 6);
        System.out.println(answer);

    }
}
