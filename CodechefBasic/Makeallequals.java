package CodechefBasic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Makeallequals {
        static PrintWriter pw = new PrintWriter(System.out);
        static FastReader sc = new FastReader();

        public static void main(String[] args) throws Exception {
            int tc = sc.nextInt();
            for (int i = 0; i < tc; i++) {
                solve();
            }
            pw.close();
        }

        public static void solve() {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int max = 0;
            int k = a[0];
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (k == a[i]) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    max = Math.max(max, count);
                    k = a[i];
                    count = 1;
                }
            }
            pw.println(n - max);
        }

        static boolean isEven(int n) {

            if ((n ^ 1) == n + 1)
                return true;
            else
                return false;
        }

        static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
                br = new BufferedReader(
                        new InputStreamReader(System.in));
            }

            String next() {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() {
                return Integer.parseInt(next());
            }

            long nextLong() {
                return Long.parseLong(next());
            }

            double nextDouble() {
                return Double.parseDouble(next());
            }

            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }
    }

