class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        while(n>0){
            int digit=n%10;
            pq.offer(digit);
            n/=10;
        }
        int a = pq.poll();
        int b = pq.poll();
        return a*b;
    }
}