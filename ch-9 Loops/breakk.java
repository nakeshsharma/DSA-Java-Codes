import java.util.*;
public class breakk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//USE OF BREAK-----------
        //  for(int i=0; i<=5; i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        //  }
        //  System.out.println("i am out of the loop");

        //QUES-KEEP ENTERING NUMBER TILL USER ENTER A MULTIPLE OF 10---
 
        do{
            System.out.println("enter your number");
        int n = sc.nextInt();
            if(n % 10 == 0)
            {
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}
