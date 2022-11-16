package CodechefBasic;

import java.util.Scanner;

public class ReachHostel {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int X = s.nextInt();
            int Y = s.nextInt();
            int K = s.nextInt();
            if (X % K == 0 && Y % K == 0) {
                System.out.print("YES" + "\n");
            } else
                System.out.print("NO" + "\n");
        }

    }


}
//    static boolean canReach(int X, int Y, int steps) {
//        // Termination Condition
//        if (X == 0 && Y == 0) {
//            return true;
//        }
//        if (X < 0 || Y > 0) {
//            return false;
//        }
//        if (X > 0 || Y < 0) {
//            return false;
//        }
//        // Otherwise, recursively call by
//        // decrementing 3^i at each step
//        return (
//                canReach(X - (int) Math.pow(3, steps), Y, steps + 1)
//                        | canReach(X, Y - (int) Math.pow(3, steps), steps + 1));
//    }
