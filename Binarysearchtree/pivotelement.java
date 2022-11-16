package Binarysearchtree;

//minimum element from a rotated and sorted array
public class pivotelement {
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

    public static void main(String[] args) {
        int[] arr = {7, 9, 1, 2, 3};
        int answer = pivot(arr);
        System.out.println( "Pivot is  at index "+ answer);
    }
}
