class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        Stack<Integer> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='('){
                c++;
                stack.push(c);
                list.add(c);
            }
            else if(ch==')'){
                list.add(stack.pop());
            }
        }
        return list;
    }
};