public class arithmetic{
    public static void main(String[] args) {
        //BINARY OPERATOR----
        int b = 34;
        int a = 68;
        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        int divide = a / b;//gives quotient
        int modulo = a % b;//gives remainder
        System.out.println("SUM=" + sum);
        System.out.println("diff=" + diff);
        System.out.println(multi);
        System.out.println(divide);
        System.out.println(modulo);

        //UNARY OPERATOR------
        //pre increment--- first increase value and then print;
        // int x = 78;
        // int y = ++x;
        // System.out.println(x);
        // System.out.println(y);
        
        //post increment-- first use value and then increase;
        int x = 78;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
    }
}