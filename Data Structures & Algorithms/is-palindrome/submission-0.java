class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
           
            if(!Character.isLetterOrDigit(l) || Character.isWhitespace(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)  || Character.isWhitespace(r)){
                right--;
            }
            else if(l == r)
            {
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
