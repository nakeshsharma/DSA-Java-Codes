import java.util.*;

public class decbin {

    public static void DecToBin(int DecNum)
    {
        int MyNum = DecNum;
        int pow = 0;
        int BinNum = 0;
        while(DecNum>0)
        {
            int rem = DecNum %2;
            BinNum = BinNum + rem * (int)Math.pow(10,pow);

            pow++;
            DecNum= DecNum/2;
        }
        System.out.println("Binary of "+MyNum+" = "+BinNum);
    }
    public static void main(String args[])
    {
        

        for(int i = 0; ; i++){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int x = sc.nextInt();
        DecToBin(x);
        }

    }
    
}
