import java.util.*;

public class mergesort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirstt(int data) {
        // create new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;

        }

        newnode.next = head;

        head = newnode;
    }

    public void PrintList() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }

    public Node sort(Node head){
        if (head==null || head.next==null) {
            return head;
            
        }
        //find mid
        Node mid=getmid(head);
        //left and right mergesort
        Node righthead=mid.next;
        mid.next=null;
        Node newleft =sort(head);
        Node newright= sort(righthead);
        ////merge
        return merge(newleft,newright);
    }

    public static void main(String[] args) {
        mergesort ll = new mergesort();
        ll.addfirstt(1);
        ll.addfirstt(6);
        ll.addfirstt(5);
        ll.addfirstt(8);
        ll.addfirstt(3);
        System.out.println("UNSORTED LINKED LIST");
        ll.PrintList();
        ll.head = ll.sort(ll.head);
        System.out.println("SORTED LINKED LIST:");
        ll.PrintList();

    }

}
