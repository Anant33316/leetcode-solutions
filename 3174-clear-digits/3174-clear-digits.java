class Solution {
    public String clearDigits(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String sh ="";
        while(!st.isEmpty()){
            sh += st.pop();
        }
        String rev = new StringBuilder(sh).reverse().toString();
        return rev;
    }
}