package CodechefBasic;

import java.util.Scanner;

public class Cricup {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int test = s.nextInt();
            for(int i = 1; i<=test ; i++) {
                int skills = s.nextInt();
                int max_skills = s.nextInt();
                int diff = s.nextInt();
                int skillFinal = Math.abs(skills-max_skills);
                if(skillFinal <=diff) {
                    System.out.println("YES");

                }else System.out.println("NO");
            }

        } catch(Exception e) { }
    }
}
