class Solution {
    public int sumOfSquares(int[] nums) {
        int k = nums.length;
        int sum =0;
        for(int i=1;i<=nums.length;i++){
            int j=i;
            if(k%j==0){
                sum+=Math.pow(nums[j-1],2);
            }
        }
        return sum;
    }
}