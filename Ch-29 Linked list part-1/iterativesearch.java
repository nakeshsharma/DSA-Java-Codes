public class iterativesearch {
    
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
        Node newnode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newnode;
            size++;  
        }
        newnode.next=head;
        head=newnode;
    }
   
        public int search(int key){
            Node temp=head;
            int i=0;
            while (temp!=null) {
                 if (temp.data==key) {
                    return i;
                 }
                 temp=temp.next;
                 i++;
            }
            return -1;

        }
      
        public static void main(String[] args) {
            iterativesearch  list=new iterativesearch();
            list.addfirstt(1);
            list.addfirstt(2);
            list.addfirstt(3);
            list.addfirstt(4); 
            
            System.out.println(list.search(3));
            System.out.println(list.search(10));
        }
}
