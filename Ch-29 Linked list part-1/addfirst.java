public class addfirst {
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
    

    public static void main(String[] args) {
        addfirst list=new addfirst();
        list.addfirstt(1);
        list.addfirstt(2);


      
        
        
    }
    
}
