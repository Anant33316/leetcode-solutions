class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
            }
            right[i]=sum;
        }
        left[0]=0;
        for(int i=1;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums[j];
            }
            left[i]=sum;
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = Math.abs(left[i]-right[i]);
        }
        return arr;
    }
}