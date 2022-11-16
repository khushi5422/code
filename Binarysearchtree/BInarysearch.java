package Binarysearchtree;
//binary must be applied to monotonic functions only means increasing or decreasing

public class BInarysearch {
    public static int binarysearch(int arr[], int size, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == arr[mid]) {
                return mid;
                //As key is greater so move to right path and make start the next element of mid +1 value
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
            //as key is less so move to left path and make the end mid-1 value as we cant move start
            else {
                end = mid - 1;
            }
            mid = (start + end) / 2;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8, 10, 12};
        int[] odd = {1, 3, 5, 7, 9, 11};

        int value = binarysearch(even, even.length, 10);
        System.out.println("The element to be find is 10  " + value);
        int ovalue = binarysearch(odd, odd.length, 9);
        System.out.println("The element to be find is 9  " + ovalue);

    }
}
