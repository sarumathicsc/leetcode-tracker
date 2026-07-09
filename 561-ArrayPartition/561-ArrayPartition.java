// Last updated: 7/9/2026, 7:42:05 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum = 0;

        for(int i = 0; i < nums.length; i+=2){
            maxsum += nums[i];
        }
        return maxsum;
    }
}