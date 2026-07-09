// Last updated: 7/9/2026, 7:39:46 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int middleElement = nums[n / 2];
        int count = 0;

        for(int num : nums){
            if(num == middleElement){
                count++;
            }
        }
        return count == 1;
    }
}