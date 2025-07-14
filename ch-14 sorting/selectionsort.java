import java.util.*;
public class selectionsort {

    public static void selectionsorting(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos= i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos]>arr[j]) {
                    //swap 
                    minpos=j;
                }
                
            }
            //swap
            int temp= arr[minpos];
            arr[minpos]= arr[i];
            arr[i]= temp;
        }


    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,2,8,4};
        System.out.println();
        selectionsorting(arr);
        printarr(arr);

    }
}
    

