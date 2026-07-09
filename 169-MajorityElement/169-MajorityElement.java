// Last updated: 7/9/2026, 7:42:30 AM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        return nums[nums.length / 2];
    }
}