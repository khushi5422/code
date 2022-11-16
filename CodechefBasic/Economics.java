package CodechefBasic;

import java.util.Scanner;

public class Economics {
    public static void main(String[] args) {
        int key_points = 0;
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            Scanner s1 = new Scanner(System.in);
            int point = s.nextInt();
            int [] supply = new int[point];
            int [] demand = new int[point];
            int j, k;
            for (j = 0; j <= point; j++) {
                supply[j]=s.nextInt();
            }
            for (k = 0; k <= point; k++) {
                demand[k] =s.nextInt();
            }
            for (int l = 0; l <= point; l++) {

                if (supply[l] == demand[l]) {
                    key_points++;
                }
                System.out.println(key_points);
            }
        }
    }
}

