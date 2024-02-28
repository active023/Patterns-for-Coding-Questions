public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int value = x;
        while (value != 0) {
            int reminder = value % 10;
            reversed = reversed * 10 + reminder;
            value = value / 10;
        }
        return reversed == x;
    }
}
