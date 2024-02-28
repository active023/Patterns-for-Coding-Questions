public class NumberOf1Bits {

    public static void main(String[] args) {
        System.out.println(new NumberOf1Bits().hammingWeight(00000000000000000000000000001011));
    }

    public int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
