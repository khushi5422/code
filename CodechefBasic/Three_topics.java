package CodechefBasic;

import java.util.Scanner;

public class Three_topics {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter the topics:");
            int Topics1 = s.nextInt();
            int Topics2 = s.nextInt();
            int Topics3 = s.nextInt();
            System.out.println("Topic X:");
            int X = s.nextInt();
            if (X == Topics1 || X == Topics2 || X == Topics3) {
                System.out.println("Pass");
            } else System.out.println("Fail");
        }
    }
}

