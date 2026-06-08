public class tiling {
    public static int tiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tiles(n-1);

        //horizontal choice
        int fnm2=tiles(n-2);
        int totalways=fnm1+fnm2;
return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tiles(4));
        
    }
    
}
