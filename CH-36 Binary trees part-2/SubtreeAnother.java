//SUBTREE OF ANOTHER TREE

public class SubtreeAnother {
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
    public static Boolean Identical(Node node,Node subroot){
        if (node==null && subroot==null) {
            return true;
        }
        else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if (!Identical(node.left, subroot.left)) {
            return false;
            
        }
        if (!Identical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }
    public static Boolean Subtree(Node root,Node subroot){
        if (root==null) {
            return false;
            
        }
        if (root.data==subroot.data) {
            if(Identical(root, subroot)){
                return true;
            }

        }
       
        return Subtree(root.left,subroot) ||Subtree(root.right,subroot);
    }
    public static void main(String[] args) {
        //TREE
        Node root= new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right=new Node(7); 
        
        //SUBTREE
        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);

        System.out.println(Subtree(root, subRoot));
    }
}
