class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int i=1;i<=size;i++){
            set.add(i);
        }
        HashSet<Integer>set1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set1.add(nums[i]);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int i:set){
            if(!set1.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}