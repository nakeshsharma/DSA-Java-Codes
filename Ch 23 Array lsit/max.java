import java.util.ArrayList;
import java.util.Collections;

public class max {
    public static void swap(ArrayList<Integer>list, int idx1,int idx2){
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);


    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(3);
        
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <list.size(); i++) {
            // if (max<list.get(i)) {
            //     max=list.get(i);
                //or
                max=Math.max(max, list.get(i));
                
            // }
            
        }
        System.out.println("max element " + max);
        //SWAPPING TWO NUMBERS
        int idx1=1;
        int idx3=3;
        System.out.println(list);
        swap(list, idx1, idx3);
        System.out.println(list);


        //SORTING
            ArrayList<Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(11);
        list1.add(7);
        list1.add(12);
        list1.add(90);
        System.out.println("before Sorting" + list1);
        Collections.sort(list1);
        System.out.println("After sorting" + list1);

        //DESCENDING ORDER
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(" Desending Sorting" +list1);
        

    }
    
}
