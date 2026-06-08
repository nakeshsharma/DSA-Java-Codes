import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= number-1; i++) {
            if (number % i== 0) {
                isprime = false;   
            }
            
        }
        if (isprime==true) {
            System.out.println ("is a prime number");
            
        } else {
            System.out.println("in not a prime number");
            
        }
    }
    
}
