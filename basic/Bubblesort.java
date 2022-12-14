package basic;

public class Bubblesort {
    void bubbleSort(int[] arr)
        {

            for (int i = 0; i < arr.length - 1; i++)
                for (int j = 0; j < arr.length - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }
        void printArray(int[] arr)
        {
            for (int i = 0; i < arr.length; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
        public static void main(String[] args)
        {
            Bubblesort ob = new Bubblesort();
            int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
            ob.bubbleSort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
    }



