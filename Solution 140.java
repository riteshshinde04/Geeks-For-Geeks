class Solution {
    boolean kPangram(String str, int k) {
        // code here
        String str1 = str.replaceAll("\\s", "");
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            set.add(ch);
        }
        if(str1.length()>=26&&set.size()+k>=26){
            return true;
        }
        return false;
    }
}