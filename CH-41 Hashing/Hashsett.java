import java.util.*;
public class Hashsett {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(8);
        hs.add(3);
        System.out.println(hs);
        System.out.println(hs.contains(9));
        hs.remove(3);
        System.out.println(hs.contains(3));
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());



        
    }
}
