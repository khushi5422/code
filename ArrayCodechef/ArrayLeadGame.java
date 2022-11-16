package ArrayCodechef;

import java.util.Scanner;

public class ArrayLeadGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of rounds:");
        int round = s.nextInt();
        int player1 =0;
        int player2 = 0;
        for(int i = 0 ; i<round; i++) {
            System.out.println("Player 1:");
            player1 = s.nextInt();
            System.out.println("Player 2:");
            player2 = s.nextInt();
        }
        int leader;
        if (player1 > player2) {
            leader = 1;
            System.out.println("player 1");
        } else {
            leader = 2;
            System.out.println("player 2");
        }
        int lead = Math.abs(player1 - player2);
//            System.out.println(lead);

        int[] arr = {player1, player2, leader, lead};
        for (int j = 0; j < 4; j++) {

            System.out.print(arr[j] + " ");
        }
        System.out.println();
        int[] Leadvalue = {lead};
        int max = Leadvalue[0];
        for(int k = 0 ; k< Leadvalue.length;k++){
            if(Leadvalue[k]> max){
                max=Leadvalue[k];
            }
        }
        System.out.println("Winner with Maximum lead is:"+max);

    }
}
