class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        String sh ="";
        for(char i:map.keySet()){
            pq.offer(i);
        }
        while(!pq.isEmpty()){
            char ch = pq.poll();
            for(int i=0;i<map.get(ch);i++){
                sh += ch;
            }
        }
        return sh;
    }
}