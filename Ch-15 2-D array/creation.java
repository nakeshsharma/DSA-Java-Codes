import java.util.*;
public class creation{
    public static void search(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==key) {
                  System.out.println("found at " + i + " , " + j);  
                }
                else{
                    System.out.println("key nhi h bhai");
                }
            }
        }

    }
    public static void main(String[] args) {
        int marks[][]= new int[3][3];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
             marks[i][j]=sc.nextInt();   
            }
        }
         for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
             System.out.print(marks[i][j] + " ");  
            }
            System.out.println();
    }
    System.out.println("enter key to search");
    int key = sc.nextInt();
    search(marks, key);
}
}