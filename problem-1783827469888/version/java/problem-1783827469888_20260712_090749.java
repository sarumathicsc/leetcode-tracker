// Last updated: 7/12/2026, 9:07:49 AM
1class Solution {
2    public String[] createGrid(int m, int n, int k) {
3        char[][] grid = new char[m][n];
4        for(int i = 0; i < m; i++){
5            for(int j = 0; j < n; j++){
6                grid[i][j] = '.';
7            }
8        }
9        int maxpath = countpath(m,n);
10        if(k > maxpath){
11            return new String[0];
12        }
13
14        while(true){
15            int currentpath = countgridpath(grid);
16            if(currentpath == k){
17                break;
18            }
19            boolean found = false;
20            for(int i = 0; i < m && !found; i++){
21                for(int j = 0; j < n && !found; j++){
22                    if((i == 0 && j==0) || (i == m-1 && j==n-1)){
23                        continue;
24                    }
25                    if(grid[i][j] == '#') continue;
26                    grid[i][j] = '#';
27
28                    if(countgridpath(grid) >= k){
29                        found = true;
30                    }else{
31                        grid[i][j] = '.';
32                    }
33                }                
34            }
35            if(!found){
36                return new String[0];
37            }
38        }
39        String[] ans = new String[m];
40        for(int i = 0; i < m; i++){
41            ans[i] = new String(grid[i]);
42        }
43        return ans;
44    }
45    private int countpath(int m , int n){
46        int[][] dp = new int[m][n];
47        if(dp[0][0] == '#') return 0;
48        dp[0][0] = 1;
49        for(int i = 0; i < m; i++){
50            for(int j = 0; j < n; j++){
51                if(i > 0) dp[i][j] += dp[i-1][j];
52                if(j > 0) dp[i][j] += dp[i][j-1];
53            }
54        }
55        return dp[m-1][n-1];
56    }
57    private int countgridpath(char[][] grid){
58        int m = grid.length;
59        int n = grid[0].length;
60        int[][] dp = new int[m][n];
61        if(grid[0][0] == '#') return 0;
62        dp[0][0] = 1;
63        for(int i = 0; i < m; i++){
64            for(int j = 0; j < n ; j++){
65                if(grid[i][j] == '#'){
66                    dp[i][j] = 0;
67                    continue;
68                }
69                if(i > 0){
70                    dp[i][j] += dp[i-1][j];
71                }
72                if(j > 0){
73                    dp[i][j] += dp[i][j-1];
74                }
75            }
76        }
77        return dp[m-1][n-1];
78    }
79}