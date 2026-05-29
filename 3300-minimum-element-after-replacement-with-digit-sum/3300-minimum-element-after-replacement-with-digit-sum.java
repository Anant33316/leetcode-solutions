class Solution {
    public int minElement(int[] nums) {
        int[] arr = new int[nums.length];
        int digit=0;
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            int sum=0;
            while(j>0){
                digit = j%10;
                sum+=digit;
                j/=10;
            }
            arr[i]=sum;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}