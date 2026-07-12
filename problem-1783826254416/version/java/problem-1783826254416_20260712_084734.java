// Last updated: 7/12/2026, 8:47:34 AM
1class Solution {
2    public int maxConsistentColumns(int[][] grid, int limit) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int[] dp = new int[n];
7        int maxlen = 1;
8
9        for(int j = 0; j < n; j++){
10            dp[j] = 1;
11            for(int a = 0 ; a < j; a++){
12                boolean validpair = true;
13                for(int i = 0; i < m; i++){
14                    if(Math.abs(grid[i][j] - grid[i][a]) > limit){
15                        validpair = false;
16                        break;
17                    }
18                }
19                if(validpair){
20                    dp[j] = Math.max(dp[j],dp[a]+1);
21                }
22            }
23            maxlen = Math.max(maxlen,dp[j]);
24        }
25        return maxlen;
26    }
27}