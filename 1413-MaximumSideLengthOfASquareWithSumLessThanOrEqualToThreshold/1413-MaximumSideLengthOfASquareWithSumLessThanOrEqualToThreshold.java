// Last updated: 7/9/2026, 7:41:33 AM
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;
        
        // Step 1: Build prefix sum matrix
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i + 1][j + 1] = mat[i][j] 
                                     + prefix[i][j + 1] 
                                     + prefix[i + 1][j] 
                                     - prefix[i][j];
            }
        }
        
        // Step 2: Binary search for max side length
        int left = 0, right = Math.min(m, n), ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (exists(prefix, m, n, mid, threshold)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    
    // Helper function to check if square of side k exists
    private boolean exists(int[][] prefix, int m, int n, int k, int threshold) {
        for (int i = k; i <= m; i++) {
            for (int j = k; j <= n; j++) {
                int total = prefix[i][j] 
                          - prefix[i - k][j] 
                          - prefix[i][j - k] 
                          + prefix[i - k][j - k];
                if (total <= threshold) return true;
            }
        }
        return false;
    }
}