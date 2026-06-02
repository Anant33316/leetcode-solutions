class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer>st = new Stack<>();
       int[] arr = new int[temperatures.length];
       for(int i=0;i<temperatures.length;i++){
        if(st.isEmpty()){
            st.push(i);
        }
        else if(temperatures[i]>temperatures[st.peek()]){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int val = st.pop();
                arr[val]=i-val;
            }
            st.push(i);
        }
        else{
            st.push(i);
        }
       }
       return arr;
    }
}