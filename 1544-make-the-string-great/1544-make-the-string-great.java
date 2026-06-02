import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            
            // Compare the top of the stack with the current character
            if (!st.isEmpty() && Math.abs(st.peek() - curr) == 32) {
                st.pop();
            } else {
                st.push(curr);
            }
        }
        
        // Reconstruct the string from the stack
        StringBuilder ns = new StringBuilder();
        while (!st.isEmpty()) {
            ns.append(st.pop());
        }
        
        // Stack elements are popped in reverse order, so flip it back
        return ns.reverse().toString();
    }
}
