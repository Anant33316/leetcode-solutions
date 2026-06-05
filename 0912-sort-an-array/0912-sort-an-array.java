class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int[] arr = new int[nums.length];
        int i=0;
        while(!pq.isEmpty()){
            arr[i++]=pq.poll();
        }
        return arr;
    }
}