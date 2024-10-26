class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                parenthesis.push(c);
            } else {
                if (parenthesis.isEmpty()) {
                    return false;
                }

                char top = parenthesis.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return parenthesis.isEmpty();
    }
}
