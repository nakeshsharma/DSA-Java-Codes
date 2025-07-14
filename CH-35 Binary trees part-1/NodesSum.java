public class NodesSum {
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
    public static int Sum(Node root){
        if (root==null) {
            return 0;
            
        }
        int Lsum=Sum(root.left);
        int Rsum=Sum(root.right);
        return Lsum+Rsum+root.data;
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        System.out.println("Sum of nodes = " + Sum(root));
    }
    
}
