class Solution {
    public int totalNumbers(int[] digits) {
        int digit=0;
        int count=0;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && i!=k && j!=k && digits[i]!=0){
                        digit=digits[i]*100+digits[j]*10+digits[k];
                    }
                    else{
                        continue;
                    }
                    if(digit%2==0 && !set.contains(digit)){
                        set.add(digit);
                        count++;
                    }
                    digit=0;
                }
            }
        }
        return count;
    }
}