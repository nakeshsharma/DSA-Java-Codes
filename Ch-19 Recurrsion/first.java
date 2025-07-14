//Program to calculate the first occurence of element in an array';';';';'

public class first {
    public static int first(int arr[],int key,int i){
           if(i==arr.length){

        return -1;
    }
        if (arr[i]==key) {
            return i;
        }
        return first(arr,key,i+1);
        }
     

    public static void main(String[] args) {
        int arr[]= {1,3,2,6,4,9,3,7};
        System.out.println(first(arr,3,0));
    }
    
}
