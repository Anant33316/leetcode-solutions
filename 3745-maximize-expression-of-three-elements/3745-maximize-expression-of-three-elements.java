class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i!=k && i!=j && j!=k){
                        int sum=nums[i]+nums[j]-nums[k];
                        max = Math.max(sum,max);
                    }
                }
            }
        }
        return max;
    }
}