// Last updated: 7/9/2026, 7:41:56 AM
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] maxrow = new int[n];
        int[] maxcol = new int[n];

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                maxrow[r] = Math.max(maxrow[r],grid[r][c]);
                maxcol[c] = Math.max(maxcol[c],grid[r][c]);
            }
        }

        int totalIncrease = 0;
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                int maxAllocated = Math.min(maxrow[r],maxcol[c]);
                totalIncrease += maxAllocated - grid[r][c];
            }
        }
        return totalIncrease;
    }
}