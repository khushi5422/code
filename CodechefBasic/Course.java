package CodechefBasic;

import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the test cases");
        int Test_case = s.nextInt();
        for(int i = 1; i<=Test_case ;i++){
            System.out.println("Enter the grp of friends to be enrolled:");
            int Group = s.nextInt();
            System.out.println("Enter the course  capacity:");
            int Capacity = s.nextInt();
            System.out.println("Enter the students already enrolled:");
            int Enroll = s.nextInt();
            if(Group>Capacity ||Group >(Capacity-Enroll)){
                System.out.println("No You can't");
            }
            else {
                System.out.println("Yes you can enroll");
            }
        }
    }
}
