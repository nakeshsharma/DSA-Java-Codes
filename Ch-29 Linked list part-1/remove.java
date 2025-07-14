public class remove{

    
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
        public int removefirst(){
            if (size==0) {
                System.out.println("LL is empty");
                return Integer.MAX_VALUE;
                
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next; 
            size--;
            return val;


        }
        public int removelast(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MAX_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }

            //prev index= size-2; as last index is size-1 and we have to go to second last
            Node prev=head;
            for (int i = 0; i < size-2; i++) {
                prev=prev.next;
                    
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;



        }
    
        public static void main(String[] args) {
            remove list=new remove();
            list.addfirstt(1);
            list.addfirstt(2);
            list.addfirstt(3);
            list.addfirstt(4);
            list.PrintList();
            System.out.println(list.removefirst());
            list.PrintList();
            System.out.println(list.removelast());
            list.PrintList();
            
    
            
    
    
          
            
            
        }
        
    }
    
    
    

    

