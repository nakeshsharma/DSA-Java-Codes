import java.util.*;
public class operations{
    public static void main(String[] args) {
     HashMap<String,Integer>hm=new HashMap<>();
     hm.put("India",100 );
     hm.put("China", 150);
     hm.put("Pakistan", 20);
     System.out.println(hm);  
     
     System.out.println(hm.get("India"));
     System.out.println(hm.get("hello"));//null value for non existing key


     System.out.println(hm.containsKey("India"));
     System.out.println(hm.containsKey("USA"));


     hm.remove("Pakistan");
     System.out.println(hm);

     //size
     System.out.println(hm.size());

        /*hm.clear();*///empty the hashmap
     //System.out.println(hm.isEmpty());


     //Iteration
     Set<String>keys=hm.keySet();
     System.out.println(keys);
     for (String k : keys) {
        System.out.println("Key=" + k + " ,Value=" + hm.get(k));
     }
    }
}