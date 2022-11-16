package basic;

import java.io.*;

public class bufferout {
    public static void main(String[] args) {
        try {
            //create a new file
            File file = new File("bufferstream.txt");
            file.createNewFile();
            //writing new string in the file
            FileOutputStream fout = new FileOutputStream("bufferstream.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Welcome to My new world";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("successlyy written");
            //reading a new file
            FileInputStream fin = new FileInputStream("bufferstream.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();


        } catch (Exception e) {
            System.out.println("unsucessfulll");
            e.printStackTrace();
        }


    }
}
