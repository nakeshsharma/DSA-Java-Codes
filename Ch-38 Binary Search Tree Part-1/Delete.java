public class Delete {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node Insert(Node root,int val){
        if (root==null) {
            root=new Node(val);
            return root;
        }
        if (root.data>val) {
            //Left subtree
           root.left= Insert(root.left, val);
            
        }
        
        else{
        root.right= Insert(root.right, val);
    }
    return root;
}
public static Node  findInorderSuccessor(Node root){
    while (root.left!=null) {
        root=root.left;
        
    }
    return root;
}  
public static Node delete(Node root,int val){
    if (root.data<val) {
        root.right=delete(root.right, val);
        
    }
    else if (root.data> val) {
        root.left=delete(root.left, val);
    }
    else{
        //case-1 leaf node
        if (root.left==null && root.right==null) {
            return null;
        }
        //case 2; Single child
        if (root.left==null) {
            return root.right;
        }
        else if (root.right==null) {
            return root.left;   
        }
        //Case 3-two child nodes
         Node IS= findInorderSuccessor(root.right);
         root.data=IS.data;
         root.right=delete(root.right, IS.data);
    }
    return root;
}
public static void inorder(Node root){
    if (root==null) {
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
    public static void main(String[] args) {
        int []values={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i = 0; i < values.length; i++) {
            root=Insert(root,values[i]);
            }
        inorder(root);
        System.out.println();
        root=delete(root, 1);
        System.out.println();
        inorder(root);
    }
    
}
