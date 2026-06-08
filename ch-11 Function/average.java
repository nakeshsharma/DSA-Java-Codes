import java.util.*;

public class average {

    public static void AverageOfThree(int a ,int b,int c)
    {
        double avg = (a+b+c)/3;
        System.out.println("Average of "+a+ ","+b+","+c+", = "+avg);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
         System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        AverageOfThree(a,b,c);


    }
}
