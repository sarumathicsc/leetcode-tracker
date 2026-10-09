// Last updated: 10/9/2026, 9:37:53 AM
class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int needed = nums[i-1]+1;
                operations += (needed - nums[i]);
                nums[i] = needed;
            }
        }
        return operations;
    }
}