public class Print {
    public static class Node{
        int data ;
        Node next;
        public Node(int data)
        {
            this.data = data ;
            this.next = null ;

        }
    }
    public static Node head ;
    public static Node tail;
    public void AddFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head  = tail = newNode;
            return ;
        }
        newNode.next = head ;
        head = newNode;
    }
    public void AddLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail =newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void PrintList()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
            return ;
        }
        Node temp = head ;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Print list = new Print();
        list.PrintList();
        list.AddFirst(2);
        list.PrintList();
        list.AddFirst(1);
        list.PrintList();
        list.AddLast(3);
        list.PrintList();
        list.AddLast(4);
        list.PrintList();
        
    }
    
}