package datastructure.stack;

//stack using Linked List
public class stacklinkedlist {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }

        public static void insert(int info, int data) {
            Node newnode = new Node(info);
            if (isEmpty()) {
                System.out.println("empty");

            }
            if (data == 0) {
                newnode.next = head;
                head = newnode;
                System.out.println("inserted at 1");

            }
            Node prev = head;
            for (int i = 0; i < data - 1; i++) {
                prev = prev.next;
            }
            ///mainnn don't mix or interchange this 2 lines
            newnode.next = prev.next;
            prev.next = newnode;
        }

        public static void delete(int position) {
            if (position == 0) {
                head = head.next;
            }
            Node prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.insert(32, 2);
        stack.delete(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}