package ArrayCodechef;

import java.util.Scanner;

public class Practiceperf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 week");
        int week1 = s.nextInt();
        System.out.println("2 week");
        int week2 = s.nextInt();
        System.out.println("3 week");
        int week3 = s.nextInt();
        System.out.println("4 week");
        int week4 = s.nextInt();
        int arr[] = {week1, week2, week3, week4};
        int counting = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i] > 10) {
                counting++;
            }
        }
        System.out.println(counting);
    }
}
