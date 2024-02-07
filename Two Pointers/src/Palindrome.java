public class Palindrome {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            while (!Character.isLetterOrDigit(l) && left < right) {
                left++;
                l = s.charAt(left);
            }
            while (!Character.isLetterOrDigit(r) && left < right) {
                right--;
                r = s.charAt(right);
            }
            if (l != r) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
