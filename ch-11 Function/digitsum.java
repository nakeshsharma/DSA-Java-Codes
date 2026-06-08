import java.util.*;

public class digitsum {

    public static int DigitSum(int n )
    {
        int sum =0;
        while(n>0)
        {
            
        int LastDigit= n%10;
         sum = sum + LastDigit;
         n=n/10;
    }
    return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       for(int i = 0; ; i++)
       {

      
            System.out.print("enter a number: ");
            int x = sc.nextInt();

             int y = DigitSum(x);
             System.out.println("Digit sum of "+x+ " is: "+y);
        }
            


        
    }
}
