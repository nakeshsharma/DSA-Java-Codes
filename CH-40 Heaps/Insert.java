//INSERT,PEEK and REMOVE A NODE IN A HEAP

import java.util.*;
public class Insert{
static class Heap{
    ArrayList<Integer>arr=new ArrayList<>();
    public void add(int data){
        //add at last index
        arr.add(data);
        //Child index
        int x=arr.size()-1;
        //parent index
        int par=(x-1)/2;
        while (arr.get(x)<arr.get(par)) {  //for max heap arr.get(x)>arr.get(par)
            int temp=arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
            x=par;
            par=(x-1)/2;
            
        }
    }
    public  int peek(){
        return arr.get(0);
    }
    private void Heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;
        if (left<arr.size() && arr.get(minIdx)> arr.get(left)) { //for max heap left<arr.size() && arr.get(minIdx)< arr.get(left)
            minIdx=left;
        }
        if (right<arr.size() && arr.get(minIdx)> arr.get(right)) { //for max heap right<arr.size() && arr.get(minIdx)< arr.get(right)
            minIdx=right;   
        }
        if (minIdx!=i) {
            //Swap
            int temp=arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);
            Heapify(minIdx);
        }
    }
    public int remove(){
        int data=arr.get(0);
        //step 1 SWAP FIRST AND LAST ELEMENT;
        int temp=arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        //step 2 delete last element
        arr.remove(arr.size()-1);

        //step 3 Heapify
        Heapify(0);
        return data;
    }
    public boolean isEmpty(){
        return arr.size()==0;
    }
   
        
    }
    public static void main(String[] args) {

        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(11);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
            
        }
    
}
}
