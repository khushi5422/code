package Binarysearchtree;

import java.util.Scanner;

public class squareroot {
    public static int square(int a) {
        int start = 0;
        int end = a;
        int answer = -1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            int square = mid * mid;
            if (square > a) {//where square is large then the a
                end = mid - 1;
            } else if (square == a) {
                return mid;
            } else {//it is less than a
                answer = mid;
                start = mid + 1;
            }

            mid = start + (end - start) / 2;
        }
        return answer;
    }

    public static double decimal(int a, int precision, int ans) {
        double temp = 1;
        double answerperfect = ans;

        for (int i = 0; i < precision; i++) {
            temp = temp / 10;
            for (double j = answerperfect; j * j < a; j = j + temp) {
                answerperfect = j;
            }
        }
        return answerperfect;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = s.nextInt();
        int ans = square(a);
        System.out.println("integer answer " + ans);
        System.out.println("precision answer is " + decimal(a, 3, ans) );

    }
}
