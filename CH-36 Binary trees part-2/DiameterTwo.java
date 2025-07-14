public class DiameterTwo {
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
    static class info{
        int diam;
        int ht;
        public info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static info Diameter(Node root){
        if (root==null) {
            return new info(0,0);
        }
        info Leftinfo=Diameter(root.left);
        info Rightinfo=Diameter(root.right);
        int diam=Math.max(Math.max(Leftinfo.diam, Rightinfo.diam),Leftinfo.ht+Rightinfo.ht+1);
        int ht=Math.max(Leftinfo.ht,Rightinfo.ht)+1;
        return new info(diam,ht);



    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right=new Node(7); 
        System.out.println("Diamter of tree= " + Diameter(root).diam);
        
    }
    
}
