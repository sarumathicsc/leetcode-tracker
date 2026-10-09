// Last updated: 10/9/2026, 9:36:17 AM
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxele = nums[0];
        for(int num : nums){
            if(num > maxele){
                maxele = num;
            }
        }
        return (maxele*k)+(k*(k-1)/2);
    }
}