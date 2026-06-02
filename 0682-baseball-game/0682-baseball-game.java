class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st= new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int dig = st.pop();
                int dig1 = st.pop();
                st.push(dig1);
                st.push(dig);
                st.push(dig+dig1);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int val =0;
        while(!(st.isEmpty())){
            val+=st.pop();
        }
        return val;
    }
}