//You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.


class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                String s = num.substring(0,i+1);
                return s;
            }
        }
        String s = "";
        return s;
    }
}