class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length<2){
            return stones[0];
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.offer(stones[i]);
        }
        while(pq.size()>1){
            int dig1 = pq.poll();
            int dig2 = pq.poll();
            if(dig1!=dig2){
                pq.offer(dig1-dig2);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.poll();
    }
}