public class Mirror {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
public static void Preorder(Node root){
    if (root==null) {
        return;
    }
    System.out.print(root.data + " ");
    Preorder(root.left);
    Preorder(root.right);
}
public static Node mirror(Node root){
    if (root==null) {
        return null;
    }
    Node LeftS=mirror(root.left);
    Node RightS=mirror(root.right);
    root.left=RightS;
    root.right=LeftS;
    return root;
}
    public static void main(String[] args) {
    Node root=new Node(8);
     root.left=new Node(5);
     root.right=new Node(10);
     root.left.left=new Node(3);
     root.left.right=new Node(6);
     root.right.right=new Node(11);
     System.out.println("Preorder Before Mirroring:");
     Preorder(root);
     root=mirror(root);
     System.out.println(" ");
     System.out.println("Preorder After Mirroring:");
     Preorder(root);
    }
    
}
