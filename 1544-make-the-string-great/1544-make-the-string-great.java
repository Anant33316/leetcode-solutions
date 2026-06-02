class Solution {
    public String makeGood(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && Character.isUpperCase(ch) && Math.abs(ch - st.peek())==32){
                st.pop();
            }
            else if(Character.isUpperCase(ch)){
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && Math.abs(ch - st.peek())==32){
                    st.pop();
                    continue;
                }
                st.push(ch);
            }
        }
        String sh="";
        while(!st.isEmpty()){
            sh+=st.pop();
        }
        String reversed = new StringBuilder(sh).reverse().toString();
        return reversed;
    }
}