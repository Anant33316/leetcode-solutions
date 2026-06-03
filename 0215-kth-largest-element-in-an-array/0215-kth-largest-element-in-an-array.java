class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        if(k==1){
            return pq.poll();
        }
        int j=0;
        while(j<k-1){
            pq.poll();
            j++;
        }
        return pq.poll();
    }
}