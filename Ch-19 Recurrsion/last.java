//Program to calculate the last occurence of element in an array';';';';'

public class last {
    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
      int isfound=lastocc(arr,key,i+1);
      if(isfound==-1 && arr[i]==key  ){
        return i;
      }
     
      return isfound;
    }
    public static void main(String[] args) {
        int arr[]= {1,3,2,6,4,9,3,7};
        System.out.println(lastocc(arr,3,0));
    }
    
}
