package CodechefBasic;

import java.util.Scanner;

public class TSTROBOT {
    public static void main(String[] args) {
        try {

            Scanner s = new Scanner(System.in);
            System.out.println("Test cases");
            int test_case = s.nextInt();
            for (int i = 1; i <= test_case; i++) {
                int count = 0;
                System.out.println("Length");
                int length = s.nextInt();
                System.out.println("INITIAL");
                int initial = s.nextInt();
                String step[] = new String[length];
                for (int j = 1; j <= step.length; j++) {
                    System.out.println("array String");
                    step[j] = s.next();
                }
                for (int k = 0; k <= step.length; k++) {
                    if (step[k] == "R") {
                        System.out.println("right");
                        initial++;
                        count++;
                    } else {
                        System.out.println("left");
                        initial--;
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {

        }


    }
}
