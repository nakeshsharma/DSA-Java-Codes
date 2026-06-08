public class addlast {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addlastt(int data) {
        // create new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;

        }

        // previous tail next point to new node
        tail.next = newnode;
        // new node make it tail
        tail = newnode;
    }

    public static void main(String[] args) {
        addlast list = new addlast();
        list.addlastt(1);
        list.addlastt(2);

    }

}
