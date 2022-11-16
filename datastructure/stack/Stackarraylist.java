package datastructure.stack;

import java.util.ArrayList;
import java.util.Stack;

public class Stackarraylist {
    static class Sttack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static Boolean isempty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isempty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Sttack sta = new Sttack();

//        Stack<Integer> stack = new Stack<>(); rather writing all functions use
//        this collection which have all the data functions written
        sta.push(8);
        sta.push(88);
        sta.push(888);
        sta.push(8888);
        sta.push(8889);
        sta.push(823);

        while (!sta.isempty()) {
            System.out.println(sta.peek());
            sta.pop();
        }
    }
}
