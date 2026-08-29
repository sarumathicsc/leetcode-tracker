// Last updated: 8/29/2026, 9:14:33 PM
1class Solution {
2    public String[] largestString(int[] nums) {
3        String[] ans = new String[nums.length];
4
5        for(int i = 0; i < nums.length; i++){
6            int x = nums[i];
7            StringBuilder sb = new StringBuilder();
8
9            while(x >= (1 << 25)){
10                sb.append('z');
11                x -= (1 << 25);
12            }
13
14            for(int bit = 24; bit >= 0; bit--){
15                if((x & (1 << bit)) != 0){
16                    sb.append((char)('a' + bit));
17                }
18            }
19            ans[i] = sb.toString();
20        }
21        return ans;
22    }
23}