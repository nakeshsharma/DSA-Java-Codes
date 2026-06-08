//MINIMUM DISTANCE BETWEEN TWO NODES
public class MinimumDistance { 
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
public static int Lcadist(Node root,int n){
    if (root==null) {
        return -1;
    }
    if (root.data==n) {
        return 0;
    }
    int leftdist=Lcadist(root.left, n);
    int rightdist=Lcadist(root.right, n);
    if (leftdist==1 && rightdist==-1) {
        return -1;
    }
    else if(leftdist==-1){
        return rightdist+1;
    }
    else{
        return leftdist+1;
    }       
}

public static int Distance(Node root,int n1,int n2){
        Node lca=Lca(root, n1, n2);
         int dist1=Lcadist(lca,n1);
         int dist2=Lcadist(lca,n2);
         return dist1+dist2;

  
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
    int n2=6;
    System.out.println("MINIMUM POSSIBLE DISTANCE= " + Distance(root, n1, n2));
   
}
    
}
