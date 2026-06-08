public class bitoperation {
    public static int getithbit(int n, int i){
        int bitmask=1<<i;
        if ((n & bitmask)==0) {
            return 0;
        }
        return 1;

    }
    public static int setithbit(int n, int i){

    }

    public static void main(String[] args) {
        System.out.println(getithbit(10,2));
    }
    
}
