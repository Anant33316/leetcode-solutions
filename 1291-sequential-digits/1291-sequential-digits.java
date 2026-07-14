class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int length = 2; length <= 9; length++){
            for(int start = 1; start <= 10-length; start++){
                int num=start;
                for(int i=1;i<length;i++){
                    num=num*10+(start+i);
                }
                list.add(num);
            }
        }
        ArrayList<Integer>list1 = new ArrayList<>();
        for(int i:list){
            if(i>=low && i<=high){
                list1.add(i);
            }
        }
        return list1;
    }
}