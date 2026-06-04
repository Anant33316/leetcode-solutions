class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        ArrayList<String>list = new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        PriorityQueue<String>pq= new PriorityQueue<>((a,b)->{
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b);
            }
            return map.get(b)-map.get(a);
            });
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        for(String i: map.keySet()){
            pq.offer(i);
        }
        int count=0;
        while(count<k){
            list.add(pq.poll());
            count++;
        }
        return list;
    }
}