import java.util.*;

public class factorial {
    public static  int bincoff(int n, int r){
        int fact_n= factorial(n)
        int fact_r= factorial(r);
        int fact_nr= factorial(n - r);
        int bin = fact_n / (fact_r * fact_nr);
        return bin;

    }
    public static int factorial(int x){
        int f= 1;
for (int i = 1; i <=x; i++) {
    
    f = f * i;  
}
return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to calculate factorial");
        int n = sc.nextInt();
        int fact= factorial(n);
        System.out.println(fact);
        ///binomial coeffefiect program;;
        System.out.println("enter value of n and r");
        int x = sc.nextInt();
        int r = sc.nextInt();
        int ans = bincoff(x , r);
        System.out.println(ans);


    }
}
