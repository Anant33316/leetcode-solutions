class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>set = new HashMap<>();
        for(int i=0;i<s.length();i++){
            set.put(s.charAt(i),set.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer>set1 = new HashMap<>();
        for(int i=0;i<t.length();i++){
            set1.put(t.charAt(i),set1.getOrDefault(t.charAt(i),0)+1);
        }
       for(char i:set1.keySet()){
        if(set1.get(i) != set.getOrDefault(i,0)){
            return i;
        }
       }
        return ' ';
    }
}