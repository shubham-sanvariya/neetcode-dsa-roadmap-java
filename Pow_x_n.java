public class Pow_x_n {
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }

    public static double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -n);
        if (n % 2 == 1)
            return x * myPow(x, n - 1);
        return myPow(x * x, n / 2);
    }
}
