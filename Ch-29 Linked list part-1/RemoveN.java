public class RemoveN {
    
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
        public void delete(int n)
        {
            int size = 0 ;
            Node temp = head ;
            while(temp!= null)//this loop is to calculate size
            {
                temp =temp.next;
                size++;
            }
            if(n==size)
            {
                head = head.next ;
            }
            //size-n
            int idx = 1 ;
            int idxtoFind = size-n ;
            Node prev = head;
            while(idx<idxtoFind)
            {
                prev = prev.next ;
                idx++;
            }
            prev.next = prev.next.next ;
            return ;
    
        }
        public static void main(String[] args) {
            RemoveN list = new RemoveN();
            
            list.AddFirst(2);
            
            list.AddFirst(1);
            
            list.AddLast(3);
            
            list.AddLast(4);
            list.PrintList();
            list.delete(3);
            list.PrintList();
    
            
            
        }
        
    }
    

