import java.util.*;
public class IterationSet {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("delhi");
        hs.add("Mumbai");
        hs.add("Noida");
        hs.add("Banglore");
        //Iteration Using Iterators
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Iteration using advance loop
        for (String HS : hs) {
            System.out.println(HS);
            
        }
    }
    
}
