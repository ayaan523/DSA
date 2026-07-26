import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> ele = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening bracket → push
            if (ch == '{' || ch == '(' || ch == '[') {
                ele.push(ch);
            }

            // Closing bracket
            else {

                // Nothing available to match
                if (ele.isEmpty()) {
                    return false;
                }

                // Check whether top matches closing bracket
                if (ele.peek() == '{' && ch == '}') {
                    ele.pop();
                }
                else if (ele.peek() == '[' && ch == ']') {
                    ele.pop();
                }
                else if (ele.peek() == '(' && ch == ')') {
                    ele.pop();
                }
                else {
                    return false;
                }
            }
        }

        return ele.isEmpty();
    }
}