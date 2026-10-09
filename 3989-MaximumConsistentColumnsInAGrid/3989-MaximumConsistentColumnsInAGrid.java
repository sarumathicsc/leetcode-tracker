// Last updated: 10/9/2026, 9:33:24 AM
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dp = new int[n];
        int maxlen = 1;

        for(int j = 0; j < n; j++){
            dp[j] = 1;
            for(int a = 0 ; a < j; a++){
                boolean validpair = true;
                for(int i = 0; i < m; i++){
                    if(Math.abs(grid[i][j] - grid[i][a]) > limit){
                        validpair = false;
                        break;
                    }
                }
                if(validpair){
                    dp[j] = Math.max(dp[j],dp[a]+1);
                }
            }
            maxlen = Math.max(maxlen,dp[j]);
        }
        return maxlen;
    }
}