package datastructure.stack;

import java.util.Stack;

public class reversestack {
    public static void pushatbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushatbottom(s, top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(31);
        s.push(32);
        s.push(33);
        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        reverse(s);
    }
}
