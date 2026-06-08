public class kadane {
    public static void kadane(int num[])
    {
int maxsum= Integer.MIN_VALUE;
 int currsum= 0;
for (int i = 0; i < num.length; i++) {
    currsum= currsum + num[i];
    if (currsum<0) {
        currsum = 0;
        
    }
    maxsum= Math.max(currsum,maxsum);

    
}
System.out.println("maximum sum is " + maxsum);
    }
    public static void main(String[] args) {
        int number[] ={-2,-3,-4,-1};
        kadane(number);
    }
    
}
