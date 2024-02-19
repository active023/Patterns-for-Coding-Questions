public class Power {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return myPow(1 / x, -(n + 1)) * 1 / x;
            }
            return myPow(1 / x, -n);
        }
        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        } else {
            double half = myPow(x, n / 2);
            return half * half * x;
        }
    }
}
