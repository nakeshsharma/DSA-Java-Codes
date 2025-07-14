import java.util.*;
public class LinkedHm {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>hm=new LinkedHashMap<>();
        hm.put("INDIA",100);
        hm.put("China",150);
        hm.put("USA", 10);
        System.out.println(hm);
        //same operations as simple hashmap

        //Tree Set
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put( "INDIA",100);
        tm.put("China",150);
        tm.put("USA", 10);
        System.out.println(tm);//alphabetically sorted acc to keys


    }
    
}
