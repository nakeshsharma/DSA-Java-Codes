import java.util.*;
public class HashmapImplement{
static class Hashmap<K,V>{  //Generic parameterised
    private class node{
        K key;
        V value;
        public node(K key,V value){
            this.key=key;
            this.value=value;

        }
    }
    private int n;//n
    private int N;
    //Array of Linked List
    private LinkedList<node>buckets[];//N
    @SuppressWarnings("unchecked")
    public Hashmap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for (int i = 0; i < 4; i++) {
            this.buckets[i]=new LinkedList<>();
            
        }
    }
    private int hashFunction(K key){
        int hc=key.hashCode();
        return Math.abs(hc)%buckets.length;//buckets.length=N;
    }
    private int SearchInLL(K key, int bi){
        LinkedList<node>ll=buckets[bi];
        int di=0;
        for (int i = 0; i < ll.size(); i++) {
            node Node=ll.get(i);
            if (Node.key==key) {
                return di;
            }
            di++;
            
        }
        return -1;
    }
    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<node>oldbucket[]=buckets;
        buckets=new LinkedList[N*2];
        N=2*N;
        for (int i = 0; i < buckets.length; i++) {
            buckets[i]=new LinkedList<>();
        }
        //Nodes add in  new Bucket
        for (int i = 0; i < oldbucket.length; i++) {
            LinkedList<node>ll=oldbucket[i];
            for (int j = 0; j < ll.size(); j++) {
                node Node=ll.remove();
                put(Node.key, Node.value);
            }
            
        }

    }
    public void put(K key,V value){
    int bi=hashFunction(key);//0 to size-1
    int di=SearchInLL(key,bi);//Valid or -1
    if (di!=-1) {
        node Node=buckets[bi].get(di);
        Node.value=value;
    }
    else{
        buckets[bi].add(new node(key,value));
        n++;
    }
        double lambda=(double)n/N;
        if (lambda>2.0) {
            rehash();
            
        }
    }

    public boolean ContainsKey(K key){
        int bi=hashFunction(key);//0 to size-1
    int di=SearchInLL(key,bi);//Valid or -1
    if (di!=-1) {//Valid key
        return true;
    }
    else{
       return false;
    }
       
     }
     public V remove(K key){
        int bi=hashFunction(key);//0 to size-1
        int di=SearchInLL(key,bi);//Valid or -1
        if (di!=-1) {
            node Node=buckets[bi].remove(di);
            n--;
           return  Node.value;
        }
        else{
            return null;
        }  
     }
     public V get (K key){
        int bi=hashFunction(key);//0 to size-1
        int di=SearchInLL(key,bi);//Valid or -1
        if (di!=-1) {
            node Node=buckets[bi].get(di);
           return  Node.value;
        }
        else{
           return null;
        }

     }
     public ArrayList<K> KeySet(){
    ArrayList<K>keys=new ArrayList<>();
    for (int i = 0; i < buckets.length; i++) {
        LinkedList<node>ll=buckets[i];
        for (node Node : ll) {
            keys.add(Node.key);
            
        }
    }  
    return keys;
     }
     public boolean isEmpty(){
        return n==0;
     }

}

public static void main(String[] args) {
    Hashmap<String,Integer>hm=new Hashmap<>();
    hm.put("india", 100);
    hm.put("China", 150);
    hm.put("Nepal", 5);
    hm.put("Japan", 50);
    ArrayList<String>keys=hm.KeySet();
    for (String key : keys) {
        System.out.println(key);
        
    }
    System.out.println(hm.get("india"));
    hm.remove("china");
    System.out.println(hm.isEmpty());
}
}