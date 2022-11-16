package datastructure.linkedlist;

public class Dll {
    private int size;

    Dll() {
        size = 0;
    }

    public static class noode {
        noode next;
        noode previous;
        int data;

        noode(int data) {
            this.data = data;
        }
    }

    static noode head;
    static noode tail;
    static noode temp;


    public static void insertathead(int data) {
        noode newnode = new noode(data);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head.previous = newnode;
            head = newnode;
        }
    }

    public static void insertattail(int data) {
        noode newnode = new noode(data);
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newnode;
        newnode.previous = tail;
        tail = newnode;
    }

    public void addat(int position, int data) {

        noode newnode = new noode(data);
        if (head == null) {
            System.out.println("empty");

        }
        if (position == 0) {
            newnode.next = head;
            head = newnode;
            System.out.println("inserted at 1");

        }
        temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.previous.next = newnode;
        temp.next = newnode;
        newnode.previous = temp;

    }

    public void deleteatany(int position) {
        if (head == null) {
            System.out.println("empty");
        }
        if (position == 0) {
            removeFirst();
        }

        noode temp2 = head;
        for (int i = 0; i < position - 1; i++) {
            temp2 = temp2.next;
        }
        noode current = temp2.next;
        current.previous = null;
        temp2.next = current.next;
        current.next = null;
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
        noode currNode = head;
        noode lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public void printList() {
        noode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Dll dl = new Dll();

        dl.insertathead(78);
        dl.insertathead(87);
        dl.insertathead(18);
        dl.insertathead(38);
        dl.insertathead(7);
        dl.insertathead(56);
        System.out.println("inserted by head");
        dl.printList();

        dl.insertattail(007);
        System.out.println("inserted by tail");
        dl.printList();

        dl.removeFirst();
        System.out.println("Removed by head");
        dl.printList();

        dl.removeLast();
        System.out.println("deleted by tail");
        dl.printList();


        dl.addat(2, 12);
        System.out.println("inserted by at position");
        dl.printList();

        dl.deleteatany(2);
        System.out.println("deleted at any position");
        dl.printList();


    }
}
