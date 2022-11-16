package Binarysearchtree;

public class peakmountain {
    public static int peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1};
        int peakanswer = peak(arr);
        System.out.println(peakanswer);

    }
}
