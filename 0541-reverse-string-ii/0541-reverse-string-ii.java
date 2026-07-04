class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(int start=0;start<s.length();start+=2*k){
            int fp = start;
            int lp = Math.min(start+k-1,arr.length-1);
            while(fp<=lp){
                char temp = arr[fp];
                arr[fp]=arr[lp];
                arr[lp]=temp;
                fp++;lp--;
            }
        }
        String result="";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
        }
        return result;
    }
}