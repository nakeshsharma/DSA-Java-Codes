/* "VERY  IMPORTANT"
 * to get last digit number%1o--
 * to remove last digit number/10---
 */


import java.util.*;
public class printreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0) {
            int lastdigit =n % 10;
            System.out.println(lastdigit );
            n = n/10;
            
        }
        System.out.println();
        
    }
}
