import java.util.*;
public class oddeven {
    public static void oddeven(int n){
        int bitmask=1;
        if ((n & bitmask)==0) {
            System.out.println("even"); //in even number LSB is always 0;
        } else {
                System.out.println("odd");//in odd LSB is always 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
oddeven(n);
    }
    
}
