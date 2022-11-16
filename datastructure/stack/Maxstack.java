package datastructure.stack;

import java.util.Stack;

public class Maxstack {
    static Stack<Integer> mainstack = new Stack<>();
    static Stack<Integer> trackstack = new Stack<>();
    static class maxele {

        public static void push(int data) {
            mainstack.push(data);
            if (mainstack.size() == 1) {
                trackstack.push(data);
                return;
            }
            if (data > trackstack.peek()) {
                trackstack.push(data);
            } else trackstack.push(trackstack.peek());
        }

        static int getMax() {
            return trackstack.peek();
        }

        static void pop() {
            mainstack.pop();
            trackstack.pop();
        }
    }

    public static void main(String[] args) {
        maxele max = new maxele();
        max.push(100);
        System.out.println(trackstack.peek());
        max.push(20);
        System.out.println(trackstack.peek());
        max.push(30);
        System.out.println(trackstack.peek());
        max.push(40);
        System.out.println(trackstack.peek());
        max.push(50);
        System.out.println(trackstack.peek());

    }
}
