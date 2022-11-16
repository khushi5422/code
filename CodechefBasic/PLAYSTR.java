package CodechefBasic;
import java.util.Scanner;
public class PLAYSTR {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("test");
            int test_case = s.nextInt();
            int a = 0;
            int b = 0;
            for (int i = 1; i <= test_case; i++) {
                int point = s.nextInt();
                int Str[] = new int[point];
                int r[] = new int[point];
                for (int j = 0; j <= point; j++) {
                    System.out.println("S");
                    Str[j] = s.nextInt();
                }
                for (int t = 0; t <= point; t++) {
                    System.out.println("R");
                    r[t] = s.nextInt();
                }
                Str[0] = a;
                Str[point - 1] = b;
                a = Str[point - 1];
                b = Str[0];
                for (int p = 0; p <= point; p++) {
                    if (Str[p] == r[p]) {
                        System.out.println("YES");
                    } else System.out.println("NO");
                }
            }
        } catch (Exception e) {

        }


    }
}
