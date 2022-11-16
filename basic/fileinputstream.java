package basic;

import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("cwhkp.txt");
            int i=fin.read();
            System.out.print((char)i);
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}

