import java.util.*;

public class even {

    public static boolean IsEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      System.out.println(IsEven(n));
    }
}
