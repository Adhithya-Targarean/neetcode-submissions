class Solution {

    public String encode(List<String> strs) {
        String res = "";
        char add = (char)257;
        for(String s:strs)
        {
            res = res+s+add;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=(char)257){
                res = res+str.charAt(i);
            }
            else{
                arr.add(res);
                res = "";
            }
        }
            return arr;
    }
}
