package basic;

public class loops {
    static  void star() {
        int row = 3;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
            star();


        }
    }
