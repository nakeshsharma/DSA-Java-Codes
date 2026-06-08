import java.util.*;
public class parameters {
    // public static void calculatesum(int num1 , int num2){
    
    //     int sum = num1 + num2;
    //     System.out.println(sum);
    //     return;
    // }
    public static int calculatesum(int num1, int num2){//called as paramter or formal paramter during formal function definition
        int sum = num1 + num2;
        return sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        // calculatesum(a,b); for the first one;
        int sum = calculatesum(a , b);//here a and b are called as argument or actual paramter!!!!
        System.out.println(sum);


       
    }
}
