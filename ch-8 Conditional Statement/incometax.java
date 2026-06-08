/*
 * income <5 L = 0% tax
 * income 5-10 L = 20%tax
 * income > 10 L = 30%tax
 */

import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR INCOME");
        int income = sc.nextInt();
        int tax;
if(income<500000){
    tax = 0 * income;
    System.out.println("you have to pay 0% tax on"  +  income +   "And Your calculated tax is"  +  tax);
}
else if(income > 500000 && income < 1000000) 
{
    tax = (int) (income*0.1);
    System.out.println("you have to pay 10% tax on"  +  income  +   "And Your calculated tax is" + tax );
}
else{
   tax = (int) (income*0.3);
    System.out.println("you have to pay 30% tax on"   + income  +   "And Your calculated tax is" + tax);
}
    }
}
