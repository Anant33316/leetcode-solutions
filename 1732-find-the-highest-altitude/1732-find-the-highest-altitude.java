class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length];
        alt[0]=gain[0];
        for(int i=1;i<gain.length;i++){
            alt[i]=alt[i-1]+gain[i];
        }
        int[] altitude = new int[gain.length+1];
        altitude[0]=0;
        for(int i=0;i<alt.length;i++){
            altitude[i+1]=alt[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<altitude.length;i++){
            max=Math.max(max,altitude[i]);
        }
        return max;
    }
}