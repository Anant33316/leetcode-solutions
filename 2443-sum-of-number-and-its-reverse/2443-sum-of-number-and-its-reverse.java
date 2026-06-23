class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int i=0;
        while(i<=num){
            int j=i;
            int digit=0;
            while(j>0){
                digit=digit*10+j%10;
                j/=10;
            }
            if(i+digit==num){
                return true;
            }
            i++;
        }
        return false;
    }
}