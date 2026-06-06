class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int[] arr1 = new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j++]=nums[i];
            }
            else{
                arr1[k++]=nums[i];
            }
        }
        k=0;
        while(j<nums.length){
            arr[j++]=arr1[k++];
        }
        return arr;
    }
}