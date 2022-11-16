package CodechefBasic;

import java.util.Scanner;
//    https://www.codechef.com/practice
//            https://www.codechef.com/contests
//            https://discuss.codechef.com

public class ChefPages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" submitted practice pages: if submited then 1 otherwise 0");
        int practice = s.nextInt();
        System.out.println(" submitted  contest : if submited then 1 otherwise 0");
        int contest = s.nextInt();
        if(practice==0){
            System.out.println(" https://www.codechef.com/practice");
        } else if (contest==0 && practice==1) {
            System.out.println(" https://www.codechef.com/contests");
        } else if (practice == 1 && contest==1) {
            System.out.println("https://discuss.codechef.com");
        }
        else {
            System.out.println("invalid input please check again");
        }
    }
}
