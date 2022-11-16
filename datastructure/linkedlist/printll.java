package datastructure.linkedlist;

public class printll {
        Node head;
        static class Node {
                int data;
                Node next;
                Node(int d) {
                        data = d;
                        next = null;
                }
        }
        public static void print(printll prinnt) {
                Node currNode = prinnt.head;
                System.out.print("LinkedList: ");
                while (currNode != null) {
                        System.out.print(currNode.data + " ");
                        currNode = currNode.next;
                }
        }
        public static void main(String[] args) {
                printll prinnt = new printll();
        }
}
