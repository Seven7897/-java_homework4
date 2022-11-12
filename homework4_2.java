import java.util.Arrays;
import java.util.Stack;

import static java.lang.Integer.parseInt;

public class home4 {
    public static void main(String[] args) {
        String[] s = {"18"};
        System.out.println(evalRPN(s));
    }

    public static int evalRPN(String[] tokens) {
        if (tokens.length == 0) return 0;
        String res = "";
        String[] operators = {"+", "-", "*", "/"};
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (Arrays.asList(operators).contains(tokens[i])) {
                int secondOperand = parseInt(stack.pop());
                int firstOperand = parseInt(stack.pop());

                if ("+".equals(tokens[i])) res = Integer.toString(firstOperand + secondOperand);
                if ("-".equals(tokens[i])) res = Integer.toString(firstOperand - secondOperand);
                if ("*".equals(tokens[i])) res = Integer.toString(firstOperand * secondOperand);
                if ("/".equals(tokens[i])) res = Integer.toString(firstOperand / secondOperand);

                stack.push(res);
                continue;
            }
            stack.push(tokens[i]);
        }
        return parseInt(stack.pop());
    }
}
