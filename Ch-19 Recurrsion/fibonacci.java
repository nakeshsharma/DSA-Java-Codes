public class fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        int fbnm1=fib(n-1);
        int fbnm2=fib(n-2);
        int fbn= fbnm1+fbnm2;
        return fbn;


    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(fib(n));
    }
    
}
