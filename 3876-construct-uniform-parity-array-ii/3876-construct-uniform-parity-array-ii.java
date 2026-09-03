class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int[] arr2 = new int[nums1.length];
        boolean isodd=false;
        boolean iseven=false;
        for(int i=0;i<1;i++){
            if(nums1[i]%2==0){
                iseven=true;
                arr2[i]=nums1[i];
            }
            else{
                isodd = true;
                arr2[i]=nums1[i];
            }
        }
        if(isodd){
            return true;
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                return false;
            }
        }
        return true;
    }
}