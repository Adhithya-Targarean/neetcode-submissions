class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = 0;
        for(int i:nums){
            hs.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]-1)){
                continue;
            }
            int len= 1;
            int cur = nums[i];
            while(hs.contains(cur+1)){
                len++;
                cur++;
            }
            max = Math.max(max,len);
        }
        return max;
    }
}
