class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);
        }
        int[] arr = new int[2];
        int j=0;
        for(int i:set.keySet()){
            if(set.get(i)==1){
                arr[j++]=i;
            }
        }
        return arr;
    }
}