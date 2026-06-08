class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        int sum=0;
        int temp = n;
        int digits = 0;
        while(temp > 0){
            digits++;
            temp /= 10;
        }
        if(digits%2==0){
            while(n>0){
            int digit = n%10;
            if(count%2!=0){
                sum+=digit;
            }
            else{
                sum+=-digit;
            }
            count++;
            n/=10;
        }
        return sum;
        }
        while(n>0){
            int digit = n%10;
            if(count%2==0){
                sum+=digit;
            }
            else{
                sum+=-digit;
            }
            count++;
            n/=10;
        }
        return sum;
    }
}