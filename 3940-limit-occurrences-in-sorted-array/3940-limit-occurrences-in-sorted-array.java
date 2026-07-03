class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        int target = nums[0];
        int count=1;
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(count>=k && target==nums[i]){
                continue;
            }
            if(target == nums[i]){
                count++;
            }
            else{
                target = nums[i];
                count=1;
            }
            list.add(nums[i]);
        }
        int[] arr = new int[list.size()];
        int j=0;
        for(int i: list){
            arr[j++]=i;
        }
        return arr;
    }
}