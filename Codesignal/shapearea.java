package Codesignal;

public class shapearea {
    public static int shape(int n){
            int result = 1;
            for(int i = 1 ; i<=n+1 ; i++){
                result = result +4* i-4;
            }
            return result;
        }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(shape(n));

        }
    }

