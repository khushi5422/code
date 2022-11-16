package CodechefBasic;

import java.util.Scanner;

public class HEADBOB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test_case = s.nextInt();
        for (int i = 1; i <= test_case; i++) {
            int j = s.nextInt();
            int no  = 0 ;
            int yes  = 0 ;
            int indian  = 0 ;
            String st = s.next();
            char[] c = st.toCharArray();
            for(int k=0;k<j;k++){
                if(c[k]=='N') no++;
                if(c[k]=='I') indian++;
                if(c[k]=='Y') yes++;
            }
            if(no==j) System.out.println("NOT SURE");
            else if(yes==j) System.out.println("NOT INDIAN");
            else if(indian==j) System.out.println("INDIAN");
            else if(no+yes==j&&indian==0)System.out.println("NOT INDIAN");
            else if(no+indian==j&&yes==0)System.out.println("INDIAN");
            else System.out.println("NOT SURE");
        }


    }
}
