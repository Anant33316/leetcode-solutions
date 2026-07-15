class Solution {
    public int gcdOfOddEvenSums(int n) {
       int sumodd=0;
       int sumeven=0;
       int i=0;
       int odd=1;
       int even=2;
       while(i<n){
        sumodd+=odd;
        sumeven+=even;
        odd+=2;
        even+=2;
        i++;
       }
       int gcd=1;
       for(int j=1;j<sumodd;j++){
        if(sumodd%j==0 && sumeven%j==0){
            gcd = Math.max(gcd,j);
        }
       }
       return gcd;
    }
}