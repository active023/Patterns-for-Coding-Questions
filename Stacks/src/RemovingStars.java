import java.util.Stack;

public class RemovingStars {

    //LC2390

    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }

        Stack<Character> reverseStack = new Stack<>();
        while (!stack.empty()) {
            reverseStack.push(stack.pop());
        }

        while (!reverseStack.empty()) {
            sb.append(reverseStack.pop());
        }

        return sb.toString();
    }
}
