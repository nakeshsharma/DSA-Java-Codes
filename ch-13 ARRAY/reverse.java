import java.io.ObjectInputFilter.FilterInfo;

public class reverse {
    public static void reverse(int number[]){
        int first = 0;
        int last = number.length -1;
        while (first<last) {
            //swap t
            int temp= number[last];
            number[last]= number[first];
            number[first]= temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,5,46,76,89,99};
      reverse(num);
      for (int i = 0; i < num.length; i++) {
        System.out.print(num[i] + " ");
      }
      System.out.println();

    }
    
}
