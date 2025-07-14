public class typecasting {
    public static void main(String[] args) {
        float a = 25.86f;
        // taking it as double so use f
        // int b  = a; //this is lossy conversion
        //to do so
        int b = (int)a;
        System.out.println(b);


    }
}
