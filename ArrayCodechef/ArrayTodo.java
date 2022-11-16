package ArrayCodechef;

import java.util.Scanner;

public class ArrayTodo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases:");
        int test = s.nextInt();
        for (int k = 0; k <= test; k++) {
            int count = 0;
            System.out.println("enter the number of element you want to store:");
            int range = s.nextInt();
            int[] todolist = new int[range];
            for (int i = 0; i < range; i++) {
                todolist[i] = s.nextInt();
            }
            for (int j = 0; j < range; j++) {
                if (todolist[j] >= 1000) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
