public class prefixsum {
    public static void prefixsum(int num[]){
        int currsum= 0;
        int maxsum= Integer.MIN_VALUE;
        int prefixsum[]= new int[num.length];
        //prefix array
        for (int i = 1; i < prefixsum.length; i++) { 
prefixsum[0]= num[0];
prefixsum[i]= prefixsum[i-1] + num[i];
}

        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end= j;
                currsum= start ==0 ? prefixsum[end] : prefixsum[end] - prefixsum[start-1];
                
                 
             if (maxsum <currsum) {
                maxsum= currsum;
                
             }   
             
            }
        }
        System.out.println( "MAX SUM IS " + maxsum);
        
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        prefixsum(numbers);

    }

}
