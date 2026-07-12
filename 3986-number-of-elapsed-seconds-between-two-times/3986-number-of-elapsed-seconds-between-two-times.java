class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int count=0;
        int result=0;
        for(int i=0;i<startTime.length();i++){
            int sum1=0;
            int sum2=0;
            while(i<startTime.length() && startTime.charAt(i)!=':'){
                int first = Integer.parseInt(String.valueOf(startTime.charAt(i)));
                int second = Integer.parseInt(String.valueOf(endTime.charAt(i)));
                sum1=sum1*10+first;
                sum2=sum2*10+second;
                i++;
            }
            if(count==0){
                result+=(sum2-sum1)*3600;
            }
            else if(count==1){
                result+=(sum2-sum1)*60;
            }
            else{
                result+=sum2-sum1;
            }
            count++;
        }
        return result;
    }
}