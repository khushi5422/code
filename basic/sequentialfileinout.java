package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class sequentialfileinout {
    public static void main(String[] args) {
        try {
            File file = new File("sequenceinout.txt");
            file.createNewFile();
            FileInputStream fileInputStream = new FileInputStream("cwhkp.txt");
            FileInputStream fileInputStream2 = new FileInputStream("bufferstream.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("sequenceinout.txt");
            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream, fileInputStream2);
            int i;
            while ((i = sequenceInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            fileInputStream.close();
            fileInputStream2.close();
            sequenceInputStream.close();
            System.out.println("succesfully made");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unsuccesfull");
        }

    }
}
