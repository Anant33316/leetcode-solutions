class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>set = new HashMap<>();
        HashMap<Integer,Integer>set1 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            set.put(nums1[i],set.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            set1.put(nums2[i],set1.getOrDefault(nums2[i],0)+1);
        }
        ArrayList<Integer>list = new ArrayList<>();
        for(int key:set.keySet()){
            if(set1.containsKey(key)){
                int min = Math.min(set.get(key), set1.get(key));
                for(int i=0;i<min;i++){
                    list.add(key);
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}