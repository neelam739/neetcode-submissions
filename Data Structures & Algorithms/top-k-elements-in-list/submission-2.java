class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq= new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> heap= new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(Map.Entry<Integer, Integer> map: freq.entrySet()){
            heap.offer(new int[]{map.getValue(), map.getKey()});
            if(!heap.isEmpty() && heap.size()>k)
            heap.poll();

        }
        int[] res= new int[k];
        for(int i=0;i<k;i++){
            int[] arr= heap.poll();
            res[i]=arr[1];
        }

    return res;
    }
}
