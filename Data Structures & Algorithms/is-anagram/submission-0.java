class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] lett = new int[26];
        for(int i=0;i<s.length();i++){
            lett[s.charAt(i)-'a']++;
            lett[t.charAt(i)-'a']--;
        }
        for(int i:lett){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
