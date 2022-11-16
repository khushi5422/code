package datastructure.stack;

import java.util.Stack;

public class twostackremove {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static Stack<Integer> auxilary = new Stack<>();
    static Stack<Integer> auxilary2 = new Stack<>();

    static class removeele {

        public static void popfromsingle(Stack<Integer> integerStack, int data) {
            int count = 0;
            while (count != data) {
                System.out.println("Position 1  " + count + "  " + integerStack.peek());
                int popfrom1 = integerStack.pop();
                auxilary.push(popfrom1);
                System.out.println("popped from" + integerStack);
                count++;
            }
            while (!auxilary.isEmpty()) {
                int popfrom2 = auxilary.pop();
                integerStack.push(popfrom2);
            }
            System.out.println("Auxiliary is  made empty");

        }

        public static void popaandb(int data) {
            int count = 0;
            for (int i = 2; i <= data; i++) {
                System.out.println("Position 1 from 1 stack" + count + " " + s1.peek());
                int popfrom1 = s1.pop();
                auxilary.push(popfrom1);
                System.out.println("popped from" + s1);
                count++;
                System.out.println("Position 1 from b stack" + count + " " + s2.peek());
                int popfrom2 = s2.pop();
                auxilary2.push(popfrom2);
                System.out.println("popped from" + s2);
                count++;
            }
            while (!auxilary.isEmpty()) {
                int popfrom2 = auxilary.pop();
                s1.push(popfrom2);
            }
            System.out.println("Auxiliary is  made empty");
            while (!auxilary.isEmpty()) {
                int popfrom2 = auxilary2.pop();
                s2.push(popfrom2);
            }
            System.out.println("Auxiliary2 is  made empty");
        }
    }

    public static void main(String[] args) {
        removeele remo = new removeele();
//        Scanner s = new Scanner(System.in);
//        int stack1 = s.nextInt();
//        int stack2 = s.nextInt();
//        int max = s.nextInt();
//        for(int i = 1;i<=stack1;i++){
//            int data = s.nextInt();
//            s1.push(data);
//        }
//        for(int i = 1;i<=stack2;i++){
//            int data = s.nextInt();
//            s2.push(data);
//        }
        s1.push(211);
        s1.push(212);
        s1.push(213);
        s1.push(214);


        s2.push(1);
        s2.push(21);
        s2.push(211);
        s2.push(211);

        int max = 3;
        remo.popfromsingle(s1, max);
        remo.popfromsingle(s2, max);
        remo.popaandb(max);




    }
}
