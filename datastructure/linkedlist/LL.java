package datastructure.linkedlist;

public class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public String value(int pos) {
        if (pos == 0) {
            return  head.data;
        }
        Node prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        return prev.data;
    }

    public void addat(int pos, String data) {
        int position = Integer.valueOf(pos);
        Node newnode = new Node(data);
        if (head == null) {
            System.out.println("empty");

        }
        if (position == 0) {
            newnode.next = head;
            head = newnode;
            System.out.println("inserted at 1");

        }
        Node prev = head;
        for (int i = 0; i < position - 1; i++) {
            prev = prev.next;
        }
        ///mainnn don't mix or interchange this 2 lines
        newnode.next = prev.next;
        prev.next = newnode;
    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public int getSize() {
        return size;
    }


    public static void main(String args[]) {
        LL list = new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.addat(2, "khushi");
        String val =list.value(3);
        System.out.println(val);
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();


    }
}
