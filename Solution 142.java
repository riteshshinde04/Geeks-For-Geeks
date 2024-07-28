class Solution {
    String removeDups(String str) {
        // code here
        Set<Character> set = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        for(char c:chars){
            set.add(c);
        }
        
        StringBuilder string = new StringBuilder();
        for(char c:set){
            string.append(c);
        }
        return string.toString();
    }
}