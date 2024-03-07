public class MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        int countOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOnes - 1; i++) {
            sb.append("1");
        }
        for (int i = countOnes - 1; i < s.length() - 1; i++) {
            sb.append("0");
        }
        sb.append("1");
        return sb.toString();
    }
}
