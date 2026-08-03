// Last updated: 8/3/2026, 9:29:30 PM
1class Solution {
2    public String stoneGameIII(int[] stoneValue) {
3        int n = stoneValue.length;
4        int next1 = 0, next2 = 0, next3 = 0;
5        
6        for (int i = n - 1; i >= 0; i--) {
7            int take1 = stoneValue[i] - next1;
8            
9            int take2 = Integer.MIN_VALUE;
10            if (i + 1 < n) {
11                take2 = stoneValue[i] + stoneValue[i+1] - next2;
12            }
13            
14            int take3 = Integer.MIN_VALUE;
15            if (i + 2 < n) {
16                take3 = stoneValue[i] + stoneValue[i+1] + stoneValue[i+2] - next3;
17            }
18            
19            int currentDp = Math.max(take1, Math.max(take2, take3));
20            
21            next3 = next2;
22            next2 = next1;
23            next1 = currentDp;
24        }
25        
26        if (next1 > 0) return "Alice";
27        if (next1 < 0) return "Bob";
28        return "Tie";
29    }
30}
31