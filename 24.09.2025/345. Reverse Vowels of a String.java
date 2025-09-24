class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);

        while(i<=j){
            if(isvowel(sb.charAt(i))==true){
                if(isvowel(sb.charAt(j))==true){
                   char a = sb.charAt(i);
                   sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, a);
                    i++;
                    j--;
                }
                else{
                     j--;
                }
                
            }
            else{
                i++;
            }
        }

        return sb.toString();
    }
    public boolean isvowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}
