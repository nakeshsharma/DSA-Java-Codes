import java.util.*;
public class largest {
    public static int largestt( int num[] ) {
        int largest= Integer.MIN_VALUE;
for (int i = 0; i < num.length; i++) {
    if ( largest< num[i]) {
        largest= num[i];
        
    }
    
}
return largest;
    }

        public static int smallest( int num[] ) {
            int smallest= Integer.MAX_VALUE;
    for (int i = 0; i < num.length; i++) {
        if ( smallest> num[i]) {
            smallest= num[i];
            
        }
        
    }
    return smallest;
        }
    public static void main(String[] args) {
        int num[]= {2,32,45,23,67,88,12,454,656,352,12};
        System.out.println(largestt(num));
System.out.println(smallest(num));
        
    }
}
