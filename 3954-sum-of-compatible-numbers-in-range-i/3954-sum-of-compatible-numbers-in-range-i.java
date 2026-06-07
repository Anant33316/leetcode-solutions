class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int x =Math.max(1,n-k);
        while(x<=n+k){
            if((n & x)==0){
                sum+=x;
            }
            x++;
        }
        return sum;
    }
}