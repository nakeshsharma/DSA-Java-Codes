import java.util.*;
public class LinkedSet {
    public static void main(String[] args) {
        LinkedHashSet<String>hs=new LinkedHashSet<>();
        hs.add("akku");
        hs.add("hakku");
        hs.add("pakku");
        System.out.println(hs);
        System.out.println("-----------------------------");

        TreeSet<String>hss=new TreeSet<>();
        hss.add("akku");
        hss.add("hakku");
        hss.add("pakku");
        System.out.println(hss);

    }
}
