package CodechefBasic;

import java.util.Scanner;

public class MAGICHF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test_case = scan.nextInt();
        for(int i = 1 ; i <=test_case;i++){
            int n=scan.nextInt();
            int x=scan.nextInt();
            int s=scan.nextInt();
            for(int j=1;j<=s;j++){
                int a=scan.nextInt();
                int b=scan.nextInt();
                if(a==x){
                    x=b;
                }
                else if(b==x){
                    x=a;
                }
                else{
                    continue;
                }
            }
            System.out.println(x);
        }

        }

    }

