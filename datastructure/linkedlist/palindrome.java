package datastructure.linkedlist;

public class palindrome {
    static class node1 {
        int data;
        node1 next;

        node1(int data) {
            this.data = data;
        }
    }

    static node1 head = null;

    public void addFirst(int data) {
        node1 newNode = new node1(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        node1 currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public static node1 middle(node1 head) {
        node1 slow = head;
        node1 fast = head;
        if (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static node1 reverse(node1 head) {
        if (head == null || head.next == null) {
            return head;
        }
        node1 newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Boolean palin(node1 head) {
        if (head == null) {
            return true;
        }
        node1 mid = middle(head);
        node1 last = reverse(mid.next);
        node1 cur = head;
        while (last != null) {
            if (last.data != cur.data) {
                System.out.println("not a palindrome");
                return false;
            }
            last = last.next;
            cur = cur.next;
        }
        System.out.println("palindrome");
        return true;

    }

    public static void main(String[] args) {

        palindrome pal = new palindrome();
        pal.addFirst(21);
        pal.addFirst(21);
        pal.addFirst(21);
        pal.printList();
        pal.palin(head);


    }
}
