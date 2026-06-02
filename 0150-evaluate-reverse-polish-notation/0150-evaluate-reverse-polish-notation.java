class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int sum=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int val = st.pop();
                int val1=st.pop();
                st.push(val1+val);
            }
            else if(tokens[i].equals("*")){
                int val = st.pop();
                int val1=st.pop();
                st.push(val1*val);
            }
            else if(tokens[i].equals("-")){
                int val = st.pop();
                int val1=st.pop();
                st.push(val1-val);
            }
            else if(tokens[i].equals("/")){
                int val = st.pop();
                int val1=st.pop();
                st.push(val1/val);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}