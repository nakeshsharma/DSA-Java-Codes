public class palindrome {
   
   
    
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
        public Node FindMid(Node head){
            Node slow=head;
            Node fast=head;
            while (fast!=null && fast.next !=null) {
                slow=slow.next;
                fast=fast.next.next;                
            }
            return slow; //it is my mid node


        }
        public boolean checkpalindrome(){
            //base case
            if (head==null || head.next==null) {
                return true;
            }
            //step find mid
            Node midnode=FindMid(head);
            //reverse second half
            Node prev=null;
            Node curr=midnode;
            Node next;
            while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            //check right and left half
            Node right=prev;//right half head 
            Node left=head;//left half head
            while (right!=null) {
                if (left.data !=right.data) {
                    return false;  
                }
                left=left.next;
                right=right.next;
            }
            return true;

        }
       
        public static void main(String[] args) {
            palindrome list=new palindrome();
            list.addfirstt(1);
            list.addfirstt(2);
            list.addfirstt(2);
            list.addfirstt(1);
           list.PrintList();
            System.out.println(   list.checkpalindrome());
    
          
    
            
    
    
          
            
            
        }  
    }
    
        
    
    
    

