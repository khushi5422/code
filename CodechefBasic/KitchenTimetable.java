package CodechefBasic;

import java.util.Scanner;

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int size=sc.nextInt();
            int[] a=new int[size];
            for(int j=0;j<size;j++){
                a[j]=sc.nextInt();
            }
            int[] b=new int[size];
            for(int j1=0;j1<size;j1++){
                b[j1]=sc.nextInt();
            }
            int count=0,start=0;
            for(int j3=0;j3<size;j3++){
                if(b[j3]<=(a[j3]-start))
                    count++;
                start=a[j3];

            }
            System.out.println(count);

        }
    }
}
