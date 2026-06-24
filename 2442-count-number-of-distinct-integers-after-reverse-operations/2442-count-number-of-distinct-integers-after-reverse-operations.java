class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int[] arr = new int[nums.length*2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int j=nums[i];
            int digit=0;
            while(j>0){
                digit=digit*10+j%10;
                j/=10;
            }
            arr[count++]=digit;
        }
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}