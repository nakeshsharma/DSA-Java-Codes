import java.util.*;
public class bindec
{

    public static void BinToDec(int BinNum)
    {
        int MyNum = BinNum;
        int DecNum = 0;
        int pow = 0;

        while( BinNum>0)
        {
            int LastDigit = BinNum % 10 ;
            DecNum = DecNum + (LastDigit * (int)Math.pow(2,pow));

            pow++;
            BinNum=BinNum/10;
        }
        System.out.println("Decimal of "+MyNum+ " = "+DecNum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Binary Number: ");
        int x = sc.nextInt();
        BinToDec(x);
    }
}