//DIAMETER OF A TREE APPROACH ONE

public class DiameterOne{
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
    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int Diameter(Node root){
        if (root==null) {
            return 0;
        }
        int Ldiam=Diameter(root.left);
        int Rdiam=Diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int Selftdiam=lh+rh+1;
        return Math.max(Selftdiam,Math.max(Rdiam, Ldiam));

    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right=new Node(7); 
        System.out.println("Diamter of tree= " + Diameter(root));       
        
    }
}