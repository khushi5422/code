package datastructure.linkedlist;

public class Circularll {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node tail;

    public void insert( Node tail ,int element, int d) {
        //empty list
        if (tail == null) {
            Node newnode = new Node(d);
            tail = newnode;
            newnode.next = newnode;
        } else {
            //non-empty list
            Node current = tail;
            while (current.data != element) {
                current = current.next;
            }
            Node temp = new Node(d);
            temp.next = current.next;
            current.next = temp;
        }
    }

    public void print() {
        Node temp = tail;
        do {
            System.out.println(tail.data + " ");
        } while (tail != temp);
        System.out.println(tail.data + " ");
    }


    public static void main(String[] args) {
        Circularll cll = new Circularll();
        cll.insert( tail,2, 32);
        cll.insert(tail,5, 30);
        cll.insert(tail,7, 33);
        cll.insert(tail,6, 29);
        cll.insert(tail,5, 28);
        cll.insert(tail,4, 26);
        cll.print();

    }
}
