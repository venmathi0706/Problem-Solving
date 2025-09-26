class Solution {
    public boolean canConstruct(String r, String m) {
        int freq[]=new int[26];
       for(char c:m.toCharArray()){
        freq[c-'a']++;
       }
       for(char c:r.toCharArray()){
        freq[c-'a']--;
        if(freq[c-'a']<0){
            return false;
        }
       }
        return true;
    }
}
