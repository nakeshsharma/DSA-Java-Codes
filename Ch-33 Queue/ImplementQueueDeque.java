//Implement Queue Using Deque

import java.util.*;
public class ImplementQueueDeque { 
    static class Queue{
        Deque<Integer>q=new LinkedList<>();
        //add
        public  void add(int data){
            q.addLast(data);
        }
        public int remove(){
           return  q.removeFirst();
        }
        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek" + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
         
    }
    
}
