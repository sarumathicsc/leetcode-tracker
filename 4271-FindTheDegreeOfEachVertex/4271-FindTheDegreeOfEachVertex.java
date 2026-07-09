// Last updated: 7/9/2026, 7:39:57 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        if( matrix == null || matrix.length == 0){
            return new int[0];
        }

        int n = matrix.length;
        int[] degree = new int[n];

        for(int i = 0; i < n; i++){
            int rowsum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                rowsum += matrix[i][j];
            }
            degree[i] = rowsum;
        }
        return degree;
    }
}