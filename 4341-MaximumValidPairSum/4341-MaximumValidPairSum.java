// Last updated: 7/9/2026, 7:39:50 AM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        if(n < k+1){
            return -1;
        }

        int maxsum = Integer.MIN_VALUE;
        int maxsofarI = Integer.MIN_VALUE;

        for(int i = k; i < n; i++){
            maxsofarI = Math.max(maxsofarI, nums[i-k]);
            maxsum = Math.max(maxsum,maxsofarI + nums[i]);
        }
        return maxsum;
    }
}