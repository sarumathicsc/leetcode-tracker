// Last updated: 7/9/2026, 7:40:07 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for(int num : nums){
            sum += num;
        }
        return (int) (sum % k);
    }
}