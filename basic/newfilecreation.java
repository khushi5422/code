package basic;

import java.io.File;

public class newfilecreation {
    public static void main(String[] args) {
        File file = new File("cwhkp.txt");
        try {
            file.createNewFile();
            System.out.println("succesfully");

        } catch (Exception e) {

            System.out.println("not succesfully");
            e.printStackTrace();
        }
    }
}
