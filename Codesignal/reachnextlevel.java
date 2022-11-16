package Codesignal;

public class reachnextlevel {
    public static boolean solution(int experience, int threshold, int reward) {
        if (experience + reward >= threshold) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 15, 4));


    }
}
