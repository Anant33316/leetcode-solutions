class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int max = 0;
        while(right<s.length() && left<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>1){
                int val = map.get(s.charAt(left));
                map.put(s.charAt(left),val-1);
                left++;
            }
            max=Math.max(right-left+1,max);
            right++;
        }
        return max;
    }
}