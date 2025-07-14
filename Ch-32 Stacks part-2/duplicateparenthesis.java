//DUPLICATE PARENTHESIS QUESTION(here given string will always be valid)

import java.util.*;
public class duplicateparenthesis { 
    public static boolean isduplicate(String str){
        Stack<Character>s=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
        //closing case
        if (ch==')') {
            int count=0;
            while ( s.peek()!='(')  //no empty stack checked because if there is closing then opening will be there as string will always be vaid
            {
                s.pop();
                count++; 
                
            }
        if (count<1) {
        return true; //duplicate occurs                
        }
        else{
            s.pop();
        }
        //opening condition
    
        }
        else{
            s.push(ch);
        }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b)+(c+d)) ";
        System.out.println(isduplicate(str));
    }
}
