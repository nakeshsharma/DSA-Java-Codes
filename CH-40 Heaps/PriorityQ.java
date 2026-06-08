import java.util.*;
public class PriorityQ{
    public static void main(String[] args) {
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    //   PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());  // if you want in reverse order
      pq.add(1);
      pq.add(7);
      pq.add(3);
      pq.add(5);
      while (!pq.isEmpty()) {
        System.out.println(pq.peek());
        pq.remove();
        
      } 
    }
}