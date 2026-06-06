class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        while(i<nums.length && nums[i]%2==0){
            i++;
        }
        if(i==nums.length){
            return nums;
        }
        int j=i+1;
        while(i<nums.length && i<=j){
            if(j==nums.length){
                if(i==nums.length-1){
                    break;
                }
                i++;
                j=i+1;
                continue;
            }
            if(nums[j]%2==0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j=i;
            }
            j++;
        }
        return nums;
    }
}