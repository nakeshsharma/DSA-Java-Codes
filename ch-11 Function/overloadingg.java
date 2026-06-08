public class overloadingg{
    // diff number of parameter
    public static int sum(int a , int b){
        return a + b;
    }
    public static int sum(int a , int b , int c){
        return a + b + c;
    }
    //different data types method overloading;;
    public static float sum(float a , float b){
        return a + b;
    } 
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3,4, 5));
        System.out.println(sum(3.1f,4.5f));
    }
}