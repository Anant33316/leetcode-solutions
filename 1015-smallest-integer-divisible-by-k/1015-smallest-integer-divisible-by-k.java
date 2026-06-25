class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }
        HashSet<Integer>set = new HashSet<>();
        int prod=1;
        int tar=0;
        int rem;
        int count=1;
        while(true){
            rem=prod%k;
            if(rem==0){
                return count;
            }
            else if(set.contains(rem)){
                break;
            }
            else{
                set.add(rem);
                prod = rem*10+1;
                count++;
            }
        }
        return -1;
    }
}