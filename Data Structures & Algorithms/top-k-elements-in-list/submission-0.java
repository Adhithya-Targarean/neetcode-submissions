class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->hm.get(x)-hm.get(y));
        for(int i:hm.keySet()){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i] = pq.poll();
        }
        return res;
    }
}
