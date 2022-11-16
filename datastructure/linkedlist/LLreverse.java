package datastructure.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LLreverse {
    Node head;
    private int size;

    LLreverse() {
        size = 0;
    }

    public class Node {
        String data;
        LLreverse.Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //iiterative Method
    public void reverseList() {
        Node currNode = head;
        Node prevNode = null;
        while(currNode != null) {
            Node temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        head = prevNode;
    }
    //Recursive method
    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        LLreverse lLreverse = new LLreverse();
      //  instead of writing code use collection
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        Collections.reverse(list2);



    }

}
