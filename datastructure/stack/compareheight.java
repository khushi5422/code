package datastructure.stack;

import java.util.Stack;

public class compareheight {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    static Stack<Integer> s3 = new Stack<>();

    static class max {
        public static Stack<Integer> minsize() {
            if (s1.size() < s2.size() && s1.size() < s3.size()) {
                return s1;
            } else if (s2.size() < s1.size() && s2.size() < s3.size()) {
                return s2;
            } else if (s3.size() < s1.size() && s3.size() < s2.size()) {
                return s3;
            }
            return s1;
        }

        public static void popelement(Stack<Integer> integerStack) {
            if (integerStack.size() == minsize().size()) {
                System.out.println("same");
            } else {
                while (integerStack.size() != minsize().size()) {
                    System.out.println(integerStack.peek());
                    integerStack.pop();
                }
            }
        }
    }

    public static void main(String[] args) {
        max max = new max();
        s1.push(211);
        s1.push(212);
        s1.push(213);
        s1.push(214);
        s1.push(215);
        System.out.println(s1.size());

        s2.push(1);
        s2.push(21);
        s2.push(211);
        s2.push(211);
        s2.push(231);
        s2.push(221);
        s2.push(231);
        System.out.println(s2.size());

        s3.push(1);
        s3.push(3);
        s3.push(2);
        s3.push(21);
        System.out.println(s3.size());

        max.popelement(s1);
        max.popelement(s2);
        max.popelement(s3);


    }
}

