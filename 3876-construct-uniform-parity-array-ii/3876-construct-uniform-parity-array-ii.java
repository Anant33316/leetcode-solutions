class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        for(int i=0;i<1;i++){
            if(nums1[i]%2!=0){
                return true;
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}