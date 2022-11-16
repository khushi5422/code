package Binarysearchtree;

public class searchinrotatedarray {
    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        mid = (start + end) / 2;
        while (start < end) {
            if (arr[mid] >= arr[0]) {
                start = mid + 1;

            } else
            {
                end = mid;
            }
            mid = (start + end) / 2;
        }
        return end;
    }
    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 5};
        int n = arr.length - 1;
        int key = 2;
        int answer;
        int pivot = pivot(arr);
        if (arr[pivot] <= key && key <= arr[n - 1]) {
            answer = binarysearch(arr, key);
        } else {
            answer = binarysearch(arr, key);
        }
        System.out.println(answer);
    }
}
