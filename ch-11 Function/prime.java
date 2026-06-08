import java.util.*;

public class prime


{
public static  boolean IsPrime(int n)
{
    if(n==2)
    {
        return true;
    }
    for(int i = 2; i<=n-1; i++)
    {
        if(i%n==0)
        {
            return false;
        }
    }
    return true;
}
//optimized way of calculating prime;
// public static boolean isprime(int n){ 
//     for (int i =2; i <=Math.sqrt(n); i++) {
//         if (n % i==0) {
//             return false;
            
//         }
//     }
//     return true;
// }

public static void PrimesInRange(int n)
{
    for(int i=2;i<=n; i++)
    {
        if(IsPrime(n))
        {
            System.out.print(i+" ");
        }
    }
    System.out.println();
}



    public static void main(String args[])
    {
        // int a = 13;
        // System.out.println(isprime(a));

           System.out.println(IsPrime(4));   
            // PrimesInRange(20);
    
       

    }
}