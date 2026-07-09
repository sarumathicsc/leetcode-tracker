// Last updated: 7/9/2026, 5:56:40 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[] dp = new int[n];
4
5        java.util.Arrays.fill(dp,1);
6
7        for(int i = 1; i < m; i++){
8            for(int j = 1; j < n; j++){
9                dp[j] += dp[j-1];
10            }
11        }
12        return dp[n-1];
13
14
15    }
16}