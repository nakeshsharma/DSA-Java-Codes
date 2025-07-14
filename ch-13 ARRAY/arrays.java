import java.util.*;
public class arrays{
    public static void update(int a[]){
        for (int i = 0; i < a.length; i++) {
            a[i]= a[i] +1;
            
        }
    }
public static void main(String[] args) {
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println( "phy" + marks[0]);
    System.out.println( "chem" + marks[1]);
    System.out.println("math" + marks[2]);
    marks[2]= marks[2] + 1;
    System.out.println(marks[2]);
    System.out.println(marks.length);

    // ARRAY AS FUNCTION ARGUMENT;
    int a[] = {98,99,100};
    update(a);
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }



}
}