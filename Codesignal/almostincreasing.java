package Codesignal;

public class almostincreasing {
    public static boolean solution(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            for (int j = sequence[i] - 1; j < sequence.length; j++) {
                if (sequence[i] == sequence[j]) {
                    System.out.println(sequence[i]);
                    System.out.println(sequence);
                    System.out.println("false");
                    return false;
                }
            }
        }
        System.out.println("true");
        return true;

    }

    public static void main(String[] args) {
        int[] sequence = {1, 3, 2};
        solution(sequence);
    }
}
