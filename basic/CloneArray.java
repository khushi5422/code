package basic;

public class CloneArray {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3},{2,4,5},{4,4,5}};

        System.out.println("Printing original array:");
        for(int i=0 ; i< args.length;i++){
            for(int j = 0 ; j< arr.length;j++){
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("Printing clone of the array:");
        int carr[][] =arr.clone();
        for(int i=0 ; i< carr.length;i++){
            for(int j = 0 ; j< carr.length;j++){
                System.out.println(arr[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("Are both equal?");
        System.out.println(arr==carr);

    }
}
