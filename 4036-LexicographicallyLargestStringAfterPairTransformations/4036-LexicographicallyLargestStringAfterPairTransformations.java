// Last updated: 10/9/2026, 9:32:07 AM
class Solution {
    public String[] largestString(int[] nums) {
        String[] ans = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            StringBuilder sb = new StringBuilder();

            while(x >= (1 << 25)){
                sb.append('z');
                x -= (1 << 25);
            }

            for(int bit = 24; bit >= 0; bit--){
                if((x & (1 << bit)) != 0){
                    sb.append((char)('a' + bit));
                }
            }
            ans[i] = sb.toString();
        }
        return ans;
    }
}