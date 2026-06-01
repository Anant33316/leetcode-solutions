class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        String sh = "";
        while(!st.isEmpty()){
            sh+=st.pop();
        }
        String rever = new StringBuilder(sh).reverse().toString();
        return rever;
    }
}