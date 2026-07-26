class Solution {
    public int maximumProduct(int[] nums) {
        int prod = 1;
        if(nums.length==3){
            for(int i=0;i<nums.length;i++){
                prod*=nums[i];
            }
            return prod;
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=nums.length-3;i--){
            prod*=nums[i];
        }
        int prod1=1;
        for(int i=0;i<2;i++){
            prod1*=nums[i];
        }
        prod1*=nums[nums.length-1];
        return Math.max(prod1,prod);
    }
}