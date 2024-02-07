public class Reverse {

    public static void main(String[] args) {

        String s = "ed";

        System.out.println(new Reverse().reverseWithoutRecursion("Hello"));

        //System.out.println(new Reverse().reverse("Hello"));

    }

    public String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    public String reverseWithoutRecursion(String s) {

        if (s.isEmpty()) {
            return s;
        }

        int right = s.length() - 1;

        StringBuilder sb = new StringBuilder();
        while (right >= 0) {
            sb.append(s.charAt(right));
            right--;
        }

        return sb.toString();
    }
}
