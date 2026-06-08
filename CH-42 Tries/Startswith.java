public class Startswith {
    

    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        Node(){
            for (int i = 0; i < 26; i++) {
            children[i]=null;        
                
            }
        }
    }
    public static void Insert(String word){
        Node curr=root;
        for (int level = 0; level < word.length(); level++) {
            int idx=word.charAt(level)-'a';
            if (curr.children[idx]==null) {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx]; 
        }
        curr.eow=true;
    }
    public static boolean startswith(String key){
        Node curr=root;
        for (int level = 0; level < key.length(); level++) {
            int idx=key.charAt(level)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr=curr.children[idx]; 
        }
       return true;
    }

    
    public static Node root=new Node();
    public static void main(String[] args) {
        String words[]={"apple","app","mango","man","woman"};
        for (int i = 0; i < words.length; i++) {
            Insert(words[i]);
            

        }
        String key="apu";
        System.out.println(startswith(key));
    }
}
    