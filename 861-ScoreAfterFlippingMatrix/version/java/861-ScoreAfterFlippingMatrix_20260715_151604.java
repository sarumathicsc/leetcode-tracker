// Last updated: 7/15/2026, 3:16:04 PM
1class Solution {
2    public int matrixScore(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int score = m * (1 << (n - 1));
6        
7        for (int j = 1; j < n; j++) {
8            int countSameAsFirstCol = 0;
9            
10            for (int i = 0; i < m; i++) {
11                if (grid[i][j] == grid[i][0]) {
12                    countSameAsFirstCol++;
13                }
14            }
15            int countOnes = Math.max(countSameAsFirstCol, m - countSameAsFirstCol);
16            score += countOnes * (1 << (n - 1 - j));
17        }
18        
19        return score;
20    }
21}