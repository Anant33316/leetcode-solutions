class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] arr = new int[k][2];
        int count=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b) ->(a[0]*a[0] + a[1]*a[1])-(b[0]*b[0] + b[1]*b[1]));
        for(int i=0;i<points.length;i++){
            pq.offer(points[i]);
        }
        while(count<k){
            arr[count++]=pq.poll();
        }
        return arr;
    }
}