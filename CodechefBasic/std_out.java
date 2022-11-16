package CodechefBasic;

import java.util.Scanner;

class std_out {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the integer & String:");
        String name = s1.nextLine();
        int integer = s1.nextInt();


        System.out.println("Data:" + 2 * (integer));
        System.out.println("name:" + name);

    }
}
