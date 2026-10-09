// Last updated: 10/9/2026, 9:37:12 AM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val < 0) negCount++;
                int absVal = Math.abs(val);
                totalSum += absVal;
                minAbs = Math.min(minAbs, absVal);
            }
        }

        if (negCount % 2 != 0) {
            totalSum -= 2L * minAbs;
        }

        return totalSum;
    }
}
