class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long fin=0;
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                sum+=digit;
                fin=fin*10+digit;
            }
            n/=10;
        }
        long actual=0;
        while(fin>0){
            long digit=fin%10;
            actual=actual*10+digit;
            fin/=10;
        }
        return actual*sum;
    }
}