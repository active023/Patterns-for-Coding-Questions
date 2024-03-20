public class PivotInteger {

    public int pivotInteger(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int rest = sum;
        int newSum = 0;
        for (int i = 1; i <= n; i++) {
            newSum += i;
            if (newSum == rest) {
                return i;
            }
            rest -= i;
        }
        return -1;
    }
}
