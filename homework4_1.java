package homeWork4_1;

import java.util.Stack;

public class homework4_1 {
    public static void main(String[] args) {
        String s = "{}[]()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') brackets.push(')');
            if (s.charAt(i) == '[') brackets.push(']');
            if (s.charAt(i) == '{') brackets.push('}');
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (brackets.isEmpty() || brackets.pop() != s.charAt(i)) return false;
            }
        }
        return brackets.isEmpty();
    }
}
