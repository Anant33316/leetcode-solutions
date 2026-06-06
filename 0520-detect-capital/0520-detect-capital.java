class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        if(count>1 && count!=word.length()){
            return false;
        }
        else if(count==1 && !Character.isUpperCase(word.charAt(0))){
            return false;
        }
        return true;
    }
}