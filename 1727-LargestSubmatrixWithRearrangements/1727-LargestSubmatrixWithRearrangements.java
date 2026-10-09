// Last updated: 10/9/2026, 9:38:09 AM
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;

        for(int i = 1; i < m; i++){
            for(int j = 0; j < n;j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            int[] heights = matrix[i].clone();
            Arrays.sort(heights);
            
            for (int k = 0; k < n; k++) {
                int height = heights[k];
                int width = n - k;
                maxArea = Math.max(maxArea, height * width);
            }
        }
        return maxArea;
    }
}