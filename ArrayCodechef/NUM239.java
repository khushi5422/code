package ArrayCodechef;

import java.util.Scanner;

public class NUM239 {
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int test_case = s.nextInt();
            for(int j = 1 ; j <=test_case;j++){
                int count = 0;
                int l = s.nextInt();
                int r = s.nextInt();
                for(int i=l;i<=r;i++){
                    if(i%10 ==2 || i%10==3 ||i%10==9){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        catch(Exception e){ }
    }
}
