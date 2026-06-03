class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
        }
        HashMap<Integer,String>map = new HashMap<>();
        map.put(pq.poll(),"Gold Medal");
        map.put(pq.poll(),"Silver Medal");
        map.put(pq.poll(),"Bronze Medal");
        int j=4;
        while(!pq.isEmpty()){
            map.put(pq.poll(),Integer.toString(j++));
        }
        String[] arr = new String[score.length];
        for(int i=0;i<score.length;i++){
            arr[i] = map.get(score[i]);
        }
        return arr;
    }
}