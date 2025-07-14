import java.util.*;
public class implementJCF {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        //Queue<Integer>q=new ArrayDeque<>();//other way to implement queue using arraydeque class
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
        
    }
    
}
