public class swap {
    public static void swap(int a , int b){
        int temp= a;
        a = b;
        b = temp;
        System.out.println("value of a is " + a);
        System.out.println("value of a is " + b);

    }
    public static void main(String[] args) {
        int a= 15;
        int b= 18;
        swap(a , b);
       
}
}
