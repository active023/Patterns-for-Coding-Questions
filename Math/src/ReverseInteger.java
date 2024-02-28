public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();
        int x = -123;
        System.out.println("Reversed: " + solution.reverse(x));
        x = Integer.MAX_VALUE; // This should return 0 because it will overflow
        System.out.println("Reversed: " + solution.reverse(x));
    }

    public int reverse(int x) {
        int reversed = 0;
        int reminder;
        while (x != 0) {
            reminder = x % 10;
            x = x / 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;

            reversed = reversed * 10 + reminder;
        }
        return reversed;
    }
}
