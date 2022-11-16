package Codesignal;

import java.util.Arrays;

public class sortbyheight {
    public static void main(String[] args) {
        int [] a = { -1,150,180,190,-1,-1,170};
        Arrays.sort(a);
        for(int i = 0 ; i< a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
