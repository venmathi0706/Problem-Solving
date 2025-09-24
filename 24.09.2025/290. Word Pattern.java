class Solution {
    public boolean wordPattern(String pattern, String s) {
        StringBuilder sb=new StringBuilder(s);
        String[] parts=s.split(" ");
        if(pattern.length()!=parts.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
       for(int i=0;i<pattern.length();i++){
        if((!map.containsKey(pattern.charAt(i)))&&!map.containsValue(parts[i])){
            map.put(pattern.charAt(i),parts[i]);
        }
        else if(!parts[i].equals(map.get(pattern.charAt(i)))){
            return false;
        }
       }
      return true;

    }
}
