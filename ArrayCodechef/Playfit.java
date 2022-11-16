package ArrayCodechef;

public class Playfit {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
////        int t = scan.nextInt();
////
////        while (t-- > 0) {
////            int n = scan.nextInt();
////
////            int[] a = new int[n];
////
////            for (int i = 0; i < n; i++)
////                a[i] = scan.nextInt();
////
////            int max = 0;
////            int min = Integer.MAX_VALUE;
////            for (int x : a) {
////                System.out.println(x);
////                if (x < min)
////                    System.out.println("swap");
////                min = x;
////                if (x - min > max)
////                    max = x - min;
////            }
////            if (max == 0)
////                System.out.println("UNFIT");
////            else
////                System.out.println(max);
////        }
        int[] arrA = {3, 7, 1, 4, 2, 4};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arrA.length; i++) {
            int current = arrA[i];
            if (first < current) {
                System.out.println("swap");
                second = first;
                first = current;
            } else if (second < current) {
                System.out.println("second is smaller");
                second = current;
            }
        }
        System.out.println(first+"&"+second);
    }
}
