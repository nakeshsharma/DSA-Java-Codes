//COMMON ANCESTOR APPROACH TWO
import java.util.*;
public class CommonAncestorTwo {
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
    public static Node Lca(Node root,int n1,int n2){
        if (root==null) {
            return null;
        }
        if (root.data==n1|| root.data==n2) {
            return root;
        }
        Node leftlca=Lca(root.left, n1, n2);
        Node rightlca=Lca(root.right, n1, n2);
        //leftlca=valid value but rightlca=null value--
        if (rightlca==null) {
            return leftlca;
        }
        //rightlca=valid value but leftlca=null value--
         if (leftlca==null) {
            return rightlca;
         }
         //if none of them are null--
         return root;

    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right=new Node(7);
        int n1=4;
        int n2=5;
       System.out.println( Lca(root, n1, n2).data);
    }
    
}
