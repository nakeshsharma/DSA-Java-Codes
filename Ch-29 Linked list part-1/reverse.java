public class reverse {
   
    
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
        public static int size;
        public void addfirstt(int data){
            //create new node
            Node newnode=new Node(data);
            size++;
           if(head==null){
               head=tail=newnode;
               return;
    
           }
          
           newnode.next=head;
           
           head=newnode;
       }
        public void addmiddle(int data,int index){
            if (index==0) {
                addfirstt(data);
                return;
            }
    
    
             Node newnode=new Node(data);
             size++;
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
        public void addlastt(int data){
            //create new node
            Node newnode=new Node(data);
            size++;
           if(head==null){
               head=tail=newnode;
               return;
    
           }
           //previous tail next point to new node
           tail.next=newnode;
           //new node make it tail
           tail=newnode;
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
        public void reverse(){
            Node prev =null;
            Node curr=tail=head;//in java assigbnment is done right to left so first head valuse is assigned to tail and then tail value is assigned to curr
             Node next;
             while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                
             }
             head=prev;

        }
    
        public static void main(String[] args) {
            reverse list=new reverse();
            list.addfirstt(1);
            list.addfirstt(2);
            list.addfirstt(3);
            list.addfirstt(4);
           list.PrintList();
           list.reverse();
           list.PrintList();
    
            
    
    
          
            
            
        }  
}
