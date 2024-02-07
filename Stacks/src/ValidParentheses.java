import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    char f = stack.pop();
                    if (f == '[' && c == ']') {
                    } else if (f == '{' && c == '}') {
                    } else if (f == '(' && c == ')') {
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
