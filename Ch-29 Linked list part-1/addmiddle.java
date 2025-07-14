public class addmiddle {
    
        public static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        public static Node tail;
        public void addfirstt(int data){
            //create new node
            Node newnode=new Node(data);
           if(head==null){
               head=tail=newnode;
               return;
   
           }
          
   
           //newnode next should point to head
           newnode.next=head;
           //new node make it head
           head=newnode;
       }
        public void addmiddle(int data,int index){
            if (index==0) {
                addfirstt(data);
                return;
            }
   
             Node newnode=new Node(data);
             Node temp=head;
            int i=0;
            while (i<index-1) {
                temp=temp.next;
                i++;
                
            }
            // when i = index-1 then temp->prev
            newnode.next=temp.next;
            temp.next=newnode;
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
            addmiddle list=new addmiddle();
            list.addfirstt(1);
            list.addfirstt(2);
            list.addfirstt(3);
            list.addfirstt(4);
           list.PrintList();
            list.addmiddle(25, 2);
            list.PrintList();

            
    
    
          
            
            
        }
        
    }
    
    
