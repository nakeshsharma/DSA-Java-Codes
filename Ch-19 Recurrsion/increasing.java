//Print numbers in decreasing order from n to 1;
public class increasing {
    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printinc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printinc(n);
    }
}
