// Last updated: 7/15/2026, 3:20:50 PM
1class Solution {
2    public int largestSubmatrix(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int maxArea = 0;
6
7        for(int i = 1; i < m; i++){
8            for(int j = 0; j < n;j++){
9                if(matrix[i][j] == 1){
10                    matrix[i][j] += matrix[i-1][j];
11                }
12            }
13        }
14        for (int i = 0; i < m; i++) {
15            int[] heights = matrix[i].clone();
16            Arrays.sort(heights);
17            
18            for (int k = 0; k < n; k++) {
19                int height = heights[k];
20                int width = n - k;
21                maxArea = Math.max(maxArea, height * width);
22            }
23        }
24        return maxArea;
25    }
26}