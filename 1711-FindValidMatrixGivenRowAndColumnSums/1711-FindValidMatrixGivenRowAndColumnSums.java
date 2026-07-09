// Last updated: 7/9/2026, 7:41:16 AM
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int numRows = rowSum.length;
        int numCols = colSum.length;
        int[][] matrix = new int[numRows][numCols];
        
        int[] remainingRowSum = rowSum.clone();
        int[] remainingColSum = colSum.clone();
        
        int i = 0; 
        int j = 0; 
        
        while (i < numRows && j < numCols) {
            int value = Math.min(remainingRowSum[i], remainingColSum[j]);
            matrix[i][j] = value;
            
            remainingRowSum[i] -= value;
            remainingColSum[j] -= value;
            
            if (remainingRowSum[i] == 0) {
                i++;
            }
            if (remainingColSum[j] == 0) {
                j++;
            }
        }
        
        return matrix;
    }
}
