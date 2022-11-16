package basic;

import java.util.Scanner;

public class switch_condition {
      static  void colur_select(){
         Scanner s = new Scanner(System.in);
         System.out.println("enter the colour");

         int   colour =s.nextInt();

        switch (colour){

            case 0:
                System.out.println(" you selected blue colour");
                break;
            case 1:
                System.out.println(" you selected red colour");
                break;
            case 2:
                System.out.println(" you selected brown colour");
                break;
            case 3:
                System.out.println(" you selected green colour");
                break;
            case 4:
                System.out.println(" you selected black colour");
                break;
            default:
                System.out.println("none colour is selected");

        }
    }




    public static void main(String[] args) {
        colur_select();

    }
}
