class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            int sum=0;
            while(j>0){
                int digit = j%10;
                sum+=digit;
                j/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}