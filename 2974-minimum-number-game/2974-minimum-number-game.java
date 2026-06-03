class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        int j=0;
        while(!pq.isEmpty()){
            int dig1= pq.poll();
            int dig2 = pq.poll();
            arr[j++]=dig2;
            arr[j++]=dig1;
        }
        return arr;
    }
}