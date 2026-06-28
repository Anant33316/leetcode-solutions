class Solution {
    public long[] sumOfThree(long num) {
        boolean result=true;
        long x=0;
        if((num-3)%3==0){
            x = (num-3)/3;
            result=false;
        }
        long[] arr1 = new long[0];
        if(result){
            return arr1;
        }
        long[] arr = new long[3];
        arr[0]=x;
        arr[1]=x+1;
        arr[2]=x+2;
        return arr;
    }
}