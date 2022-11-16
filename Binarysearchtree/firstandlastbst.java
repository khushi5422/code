package Binarysearchtree;

public class firstandlastbst {
    public static int firstoccurence(int arr[], int n, int key) {
        int answer = -1;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                answer = mid;
                end = mid - 1;
            } else if (key > arr[mid]) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return answer;
    }

    public static int lastoccurence(int arr[], int n, int key) {
        int answer = -1;
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                answer = mid;
                start = mid + 1;
            } else if (key > arr[mid]) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 5};
        //for first occurence
        int firstAnswer = firstoccurence(arr, 8, 5);
        //for last occurence
        int lastAnswer = lastoccurence(arr, 8, 5);
        //for counting total occurence
        int totalnumber = (lastAnswer - firstAnswer) + 1;
        System.out.println("The key we entered startes from " + firstAnswer + " and endes at " + lastAnswer + " and total number of occurence is " + totalnumber);

    }
}
