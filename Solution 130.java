class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int index = findIndex(s, ch, count);
        if(index == -1)
            return "";
        String result = s.substring(index);
        return result;
    }
    
    public int findIndex(String s, char ch, int count){
        int frequency = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ch){
                frequency++;
                if(count == frequency)
                    return i+1;
            }
        }
        return -1;
    }
}