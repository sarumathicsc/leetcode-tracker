// Last updated: 10/9/2026, 9:32:37 AM
class Solution {
    public String[] createGrid(int m, int n, int k) {
        char[][] grid = new char[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = '.';
            }
        }
        int maxpath = countpath(m,n);
        if(k > maxpath){
            return new String[0];
        }

        while(true){
            int currentpath = countgridpath(grid);
            if(currentpath == k){
                break;
            }
            boolean found = false;
            for(int i = 0; i < m && !found; i++){
                for(int j = 0; j < n && !found; j++){
                    if((i == 0 && j==0) || (i == m-1 && j==n-1)){
                        continue;
                    }
                    if(grid[i][j] == '#') continue;
                    grid[i][j] = '#';

                    if(countgridpath(grid) >= k){
                        found = true;
                    }else{
                        grid[i][j] = '.';
                    }
                }                
            }
            if(!found){
                return new String[0];
            }
        }
        String[] ans = new String[m];
        for(int i = 0; i < m; i++){
            ans[i] = new String(grid[i]);
        }
        return ans;
    }
    private int countpath(int m , int n){
        int[][] dp = new int[m][n];
        if(dp[0][0] == '#') return 0;
        dp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i > 0) dp[i][j] += dp[i-1][j];
                if(j > 0) dp[i][j] += dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    private int countgridpath(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        if(grid[0][0] == '#') return 0;
        dp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                if(grid[i][j] == '#'){
                    dp[i][j] = 0;
                    continue;
                }
                if(i > 0){
                    dp[i][j] += dp[i-1][j];
                }
                if(j > 0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}