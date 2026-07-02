class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String>pq = new PriorityQueue<>((a, b) -> {
        if (a.length() != b.length()) {
            return b.length() - a.length();
        }
        return b.compareTo(a);
    });
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
    }
}