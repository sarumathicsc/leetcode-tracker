// Last updated: 7/9/2026, 7:40:21 AM
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        Double minAvg = Double.MAX_VALUE;
        int n = nums.length;

        for(int i = 0; i < n/2; i++){
            int minElement = nums[i];
            int maxElement = nums[n-i-1];
            Double avg = (minElement + maxElement) / 2.0;
            if(minAvg > avg){
                minAvg = avg;
            }
        }
        return minAvg;
        
    }
}