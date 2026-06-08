import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter krde bhai n ki value");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter <= n) {
                sum = sum + counter;
                counter++;
            
            
        }
        System.out.println( "your sum is " + sum);
    }
}
