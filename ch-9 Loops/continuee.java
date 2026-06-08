import java.util.*;
public class continuee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*use of CONTINUE*/
        // for(int i=1; i<=10; i++){
        //     if(i==5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }   


        //QUES_ enter all number except multiple of 10--
        do {
            System.out.println("enter number");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println( "number was " + n) ;
            
            
        } while (true);
   
}
}
