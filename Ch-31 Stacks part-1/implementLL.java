public class implementLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;

        }
    }
    
    static class Stack{
    static Node head=null;
    //IS EMPTY
    public static boolean isempty(){
        return head==null;
    }
    //PUSH OPERATION
    public static void push(int data){
    Node newnode=new Node(data);{
        if (isempty()) {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
}
    //POP OPERATION
    public static int pop(){
        if (isempty()) {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    //PEEK OPERATION
    public static int peek(){
        if (isempty()) {
            return -1;
        }
        return head.data;
    }

    }

    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}
