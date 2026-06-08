//NEXT GREATER ELEMENT 

import java.util.*;
public class nextgreater {
    public static void main(String[] args) {
    int arr[]={6,8,0,1,3};
    Stack<Integer>s= new Stack<>();
    int nextgreater[]=new int[arr.length];
    for (int i = arr.length-1; i >=0; i--) {
        while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
            s.pop();
        }
        if (s.isEmpty()) {
            nextgreater[i]=-1;        
        }
        else{
        nextgreater[i]= arr[s.peek()];
    } 
    s.push(i);   
    }
    for (int i = 0; i < nextgreater.length; i++) {
        System.out.print(nextgreater[i] + " ");
        
    }
    System.out.println(" ");
    }
}

//OTHER FORMS OF THIS QUESTION 
//1-NEXT GREATER RIGHT SIDE
//2-NEXT GREATER LEFT SIDE(REVERSE THE FOR LOOP)
//3-NEXT SMALLER RIGHT SIDE(REVERSE WHILE LOOP CONDITION >= WITH SAME FOR LOOP AS GREATER RIGHT SIDE )
//4-NEXT SMALLER LEFT SIDE(REVERSE WHILE LOOP CONDITION >= WITH SAME FOR LOOP AS GREATER LEFT SIDE )
