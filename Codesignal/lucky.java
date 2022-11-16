package Codesignal;

public class lucky {
    public static  Boolean value(int n){
        String num = Integer.toString(n);

        // Add first half, subtract second half.
        int sum = 0;
        int mid = num.length()/2;

        for (int i=0; i<mid; i++) {
            sum += num.charAt(i);
            sum -= num.charAt(i+mid);
        }

        // If zero, halves match
        return (sum == 0);
    }
    public static void main(String[] args) {
        System.out.println(value(1230));


    }
}
