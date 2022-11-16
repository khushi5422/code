package ArrayCodechef;

import java.util.Scanner;
public class ArrayTarget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of questions solved in different weeks:");
        int[] numbers = new int[0];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = s.nextInt();
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] >= 10) {
                count++;
            }
        }

        System.out.println(count);
    }
}