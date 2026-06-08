//PRINT X TO THE POWER N

public class xpower {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
       int xnm1= power(x,n-1);
       int xn=x*xnm1;
       return xn;
    }
    public static int pow2(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=pow2(x,n/2);
        int halfpowsq= halfpower*halfpower;
        //n is odd
        if(n%2!=0){
            halfpowsq=x*halfpowsq;
        }
        return halfpowsq;

    }
 public static void main(String[] args) {
    System.out.println(power(2,10));
    System.out.println(pow2(2,20));
    
 }   
}
