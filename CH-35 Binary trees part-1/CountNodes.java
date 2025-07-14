public class CountNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int Count(Node root){
        if (root==null) {
            return 0;
        }
         int lcount=Count(root.left);
         int rcount=Count(root.right);
         return lcount+rcount+1;
    }

    public static void main(String[] args) {
    Node root= new Node(1);
    root.left=new Node(2);
    root.right = new Node(3);
    root.left.left =new Node(4);
    root.left.right=new Node(5);
    root.right.left = new Node(6);
    System.out.println("Height of tree = " + Count(root));   
    }
    
}
