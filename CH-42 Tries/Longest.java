//LONGEST WORD WITH ALL PREFIXES

import java.util.*;
public class Longest {
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
    public static boolean Search(String key){
        Node curr=root;
        for (int level = 0; level < key.length(); level++) {
            int idx=key.charAt(level)-'a';
            if (curr.children[idx]==null) {
                return false;
            }
            curr=curr.children[idx]; 
        }
       return curr.eow==true;
    }
    public static String ans=" ";
    public static void Longestword(Node root,StringBuilder temp){
        if (root==null) {
            return;
        }
        for (int i = 0; i < 26; i++) {//agar lexicographically small chahiye to ye loop
            //for (int i =25; i>=0 ; i--) agar  lexicographically bada chahiye to ye loop i.e apply instead of apple
            if (root.children[i]!=null && root.children[i].eow==true) {
                char ch=(char)(i+'a');
                temp.append(ch);
                if (temp.length()>ans.length()) {
                    ans=temp.toString();
                }
                Longestword(root.children[i], temp);
                //backtrack
                temp.deleteCharAt(temp.length()-1);
            }
            
        }
    }
    public static Node root=new Node();
public static void main(String[] args) {
    String words[]={"a","banana","app","appl","ap","apply","apple"};
    for (int i = 0; i < words.length; i++) {
        Insert(words[i]);
    }
    Longestword(root,new StringBuilder(" "));
    System.out.println(ans);
    
}     
}
