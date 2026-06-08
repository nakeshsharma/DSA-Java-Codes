public class Preorder{
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
    static class Binarytree{
        static int idx=-1;
        public static Node Buildtree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return null;
                
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=Buildtree(nodes);
            newnode.right=Buildtree(nodes);
            return newnode;      
        }
        public static void PreorderTraversal(Node root){
            if (root==null) {
                return;
                
            }
            System.out.print(root.data + " ");
            PreorderTraversal(root.left);
            PreorderTraversal(root.right );

        }

    }
    public static void main(String[] args) {
        int[]nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root= tree.Buildtree(nodes);
        System.out.println("Root data: " + root.data);
        tree.PreorderTraversal(root);
}
}