package datastructure.stack;

import java.util.Scanner;

public class texteditor {
    static class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
        }
    }

    static class stack {
        static node head = null;

        public static Boolean isEmpty() {
            return head == null;
        }

        public static void push(String data) {
            node newnode = new node(data);
            if (isEmpty()) {
                head = newnode;
            }
            newnode.next = head;
            head = newnode;
        }

        public static String pop() {
            if (isEmpty()) {
                return null;
            }
            node top = head;
            head = head.next;
            return top.data;
        }

        public static String peek() {
            if (isEmpty()) {
                return null;
            }
            node top = head;
            return top.data;

        }

        public static void addatend(String data) {
            push(data);

        }

        public static void deletefromlastposition(String posit) {
            int pos = Integer.parseInt(posit);
            if (pos == 0) {
                head = head.next;
            }
            node prev = head;
            for (int i = 0; i < pos - 1; i++) {
                prev = prev.next;
            }
            prev.next = null;
        }

        public static void printfrom(String poss) {
            int pos = Integer.parseInt(poss);
            if (pos == 0) {
                System.out.println(head.data);
            }
            node previous = head;
            for (int i = 0; i < pos - 1; i++) {
                previous = previous.next;
            }
            System.out.println(previous.next.data);

        }

        public static void unndo() {

        }
    }

    public static void main(String[] args) {
        stack stack = new stack();

        Scanner s = new Scanner(System.in);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        int option = s.nextInt();
        String data = s.next();

        switch (option) {
            case 1:
                stack.addatend(data);
            case 2:
                stack.deletefromlastposition(data);
            case 3:
                stack.printfrom(data);
            case 4:
                stack.unndo();
        }
    }
}
