public class subarray {
    public static void subarray(int num[]){
        int ts =0;
        for (int i = 0; i < num.length; i++) {
            int start=i;
            

            for (int j = i; j < num.length; j++) {
                int end= j;
                for (int k = start; k <= end; k++) {//print subarray
                 System.out.print(num[k] +" ");   
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print(ts);
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14,16};
        subarray(numbers);
        

    }
    
}
