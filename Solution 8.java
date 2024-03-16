class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        
        for(char c : x.toCharArray()) {
            
            if( c=='{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (( c == '}' && stack.peek()== '{') ||
                       ( c == ']' && stack.peek()== '[') ||
                       ( c == ')' && stack.peek()== '(') ) {
                           stack.pop();
                       } else {
                           return false;
                       }
        }
        return stack.isEmpty();
    }
}