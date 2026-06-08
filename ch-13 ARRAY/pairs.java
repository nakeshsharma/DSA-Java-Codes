public class pairs {
    public static void pairs(int numbers[]){
for (int i = 0; i < numbers.length; i++) {
    int current= numbers[i];//2,4,6,8----;
    for (int j = i+1; j < numbers.length; j++) {
        System.out.print("(" + current + "," + numbers[j]  + ")"  + (" "));
        
    }
    System.out.println();

}
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,12,14,16};
        pairs(num);
    }
}
