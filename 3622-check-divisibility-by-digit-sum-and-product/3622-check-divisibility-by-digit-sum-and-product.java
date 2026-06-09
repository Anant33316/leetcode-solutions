class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int tar=n;
        while(n>0){
            int digit = n%10;
            prod*=digit;
            sum+=digit;
            n/=10;
        }
        if(tar%(sum+prod)==0){
            return true;
        }
        return false;
    }
}