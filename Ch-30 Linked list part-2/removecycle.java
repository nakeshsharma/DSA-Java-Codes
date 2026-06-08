public class removecycle {
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

    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;

            }

        }
        return false;// cycle not exist
    }

    public static void removeTheCycle()
    {
        //detect cycle
        Node slow = head ;
        Node fast = head ;
        boolean cycle = false;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next ;
            fast = fast.next.next ;
            if(slow==fast)
            {
                cycle = true;
                break;
            }
        }
        if(cycle == false)
        {
            return ;
        }
        //find meeting point
        slow = head ;
        Node prev = null;
        while(slow!=fast)
        
        {
            prev = fast ;
            slow = slow.next ;
            fast = fast.next ;

        }
        //remove cycle last.next -> null
        prev.next = null ;

    }

    public static void main(String[] args) {
        detectcycle list = new detectcycle();
        head = new Node(1);
        Node temp  = new Node(2);
        head.next = temp ;
        head.next.next = new Node(3);
        head.next.next.next = temp ;

        // head.next.next.next = head ;
        System.out.println(iscycle());
        removeTheCycle();
        System.out.println(iscycle());
        

    }
}
