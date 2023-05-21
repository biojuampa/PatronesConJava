import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n == 2) return 2;
        return n * factorial(n-1);
    }
}
