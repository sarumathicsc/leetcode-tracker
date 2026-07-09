// Last updated: 7/9/2026, 7:41:01 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxSumPair = 0;

        for(int i = 0; i < n/2; i++){
            int currentSumPair = nums[i]+nums[n-1-i];
            if(currentSumPair > maxSumPair){
                maxSumPair = currentSumPair;
            }
        }
        return maxSumPair;
    }
}