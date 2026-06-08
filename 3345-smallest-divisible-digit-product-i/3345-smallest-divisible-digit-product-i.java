class Solution {
    public int smallestNumber(int n, int t) {
        int digit =n;
        while(true){
            int digit1=digit;
            int prod = 1;
            while(digit1>0){
                int dig1 = digit1%10;
                prod*=dig1;
                digit1/=10;
            }
            if(prod%t==0){
                return digit;
            }
            digit++;
        }
    }
}