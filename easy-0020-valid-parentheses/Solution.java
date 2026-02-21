class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
        );

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (map.values().contains(c)) { // c is an open-bracket
                stack.push(c);

            } else { // c is a close-bracket

                if ( // check if bracket matches ?
                    !stack.isEmpty() && 
                    stack.peek() == map.get(c)
                ) {
                    stack.pop();
                    
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
