package basic;

import com.sun.security.jgss.GSSUtil;

public class pattern {
    public static void main(String[] args) {

        int n = 3;
//        *
//        **
//        ***
//        ****
//        for(int i = 0 ; i<n;i++){
//            for(int j = 0 ; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /* ****
         ***
         **
         *
         */

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*  *
         **
         ***
         ****
         */

//        for(int i = 1; i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");}
//                for(int j = 1; j<=i;j++){
//                    System.out.print("*");
//                }
//                System.out.println( );
//            }

// 2 method
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();


//           *
//          * *
//         * * *
//        * * * *
//                for (int i = 1; i <= n; i++) {
//
//                    for (int j = n; j >= i; j--) {
//                        System.out.print(" ");
//                    }
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }

//             *
//           * * *
//         * * * * *
//        * * * * * * *

        for(int i = 1; i <=n;i++) {

            for(int j =1 ; j <=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=2*i-1;j++) {
                System.out.print("*");
            }
//            for(int j = 2; j<=i; j++){
//                System.out.print( "*");
//            }
            System.out.println();

        }

    }
}



