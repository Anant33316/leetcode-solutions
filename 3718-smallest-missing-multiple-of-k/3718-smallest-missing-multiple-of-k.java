class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j=1;
        while(true){
            boolean result = false;
            for(int i=0;i<nums.length;i++){
                if(k*j==nums[i]){
                    result=true;
                }
            }
            if(!result){
                return k*j;
            }
            j++;
        }
    }
}