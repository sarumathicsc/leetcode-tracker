// Last updated: 7/9/2026, 7:41:37 AM
class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int balance = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                balance++;
            }else{
                balance--;
            }
            if(balance == 0){
                ans++;
            }
        }
        return ans;
    }
}