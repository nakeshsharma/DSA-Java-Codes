import java.util.*;

public class palindrome
{

    public static int  reverse(int n)
    {
        int rev = 0;
        while(n>0)

        {
            int LastDigit = n%10;
            rev = rev*10 +LastDigit;
            n=n/10;

        }
        return rev;
    }



    public static void PalindromeCheck(int a)
    {
        int x = reverse(a);
        if(x==a)
        {
            System.out.println("Given Number is a palindrome number");
        }
        else{
            System.out.println("Given Number is not a palindrome number");
        }
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; i++)
        {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();
            PalindromeCheck(x);
        }
    
    }
}