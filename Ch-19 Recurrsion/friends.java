public class friends {
    public static int pairs(int n){
        if(n==1 || n==2){
            return n;
        }

       //choice SINGLE';';';';'
       int fnm1=pairs(n-1);
       //PAIRS CHOICE
       int fnm2=pairs(n-2);
       int totalways= fnm1+ (n-1)*fnm2;
       return totalways;
    }
    public static void main(String[] args) {
        System.out.println(pairs(3));
        
    }
    
}
