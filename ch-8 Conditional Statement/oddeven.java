//PRINT IF A NUMBER IS ODD OR EVEN


import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check ODD or EVEN");
        int num = sc.nextInt();
    if (num % 2 ==0){
        System.out.println(num + " is even");

    }
    else{
        System.out.println(num +  " is ODD");
    }
    }
}
