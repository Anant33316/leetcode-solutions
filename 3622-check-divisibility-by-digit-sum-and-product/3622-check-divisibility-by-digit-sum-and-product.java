class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int i=n;
        while(i>0){
            sum+=i%10;
            prod*=i%10;
            i/=10;
        }
        if(n%(sum+prod)==0){
            return true;
        }
        return false;
    }
}