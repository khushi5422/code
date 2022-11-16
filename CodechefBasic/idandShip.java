package CodechefBasic;

import java.util.Scanner;

public class idandShip {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the test cases");
        int test_case = s.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            System.out.println("enter the letter");
            String letter = s.next();
            for(int j = 0 ; j<letter.length();j++) {
                if (letter.charAt(j)=='B'||letter.charAt(j)=='b') {
                    System.out.println("BattleShip");
                } else if (letter.charAt(j)=='C'||letter.charAt(j)=='c') {
                    System.out.println("Cruiser");
                }else if (letter.charAt(j)=='D'||letter.charAt(j)=='d') {
                    System.out.println("Destroyer");
                }else if (letter.charAt(j)=='F'||letter.charAt(j)=='f') {
                    System.out.println("Frigate");
                }
            }
        }

    }
}
