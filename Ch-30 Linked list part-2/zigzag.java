import java.util.*;
public class zigzag {
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


   public void zigzag(){
    //find mid node
    Node slow=head;
    Node fast=head.next;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    //reverse second half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        
    }
    Node left=head;
    Node right=prev;
    Node nextleft;
    Node nextright;

    //  join alternatively
    while (left!=null && right!=null) {
        nextleft=left.next;
        left.next=right;
        nextright=right.next;
        right.next=nextleft;
        right=nextright;
        left=nextleft;
        
    }


   }

    public static void main(String[] args) {
        zigzag ll = new zigzag();
        ll.addfirstt(5);
        ll.addfirstt(4);
        ll.addfirstt(3);
        ll.addfirstt(2);
        ll.addfirstt(1);
        ll.PrintList();;
        ll.zigzag();
        ll.PrintList();
     

    }

}


