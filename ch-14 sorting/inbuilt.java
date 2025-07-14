import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    public static void printarr(Integer arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int arr[]={1,5,2,8,4};
        Integer arrr[]= {1,4,6,8,9};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        //if do in reverse order
        Arrays.sort(arrr, Collections.reverseOrder()); //cannot use small int use integer
        printarr(arrr);
 
    
}
}