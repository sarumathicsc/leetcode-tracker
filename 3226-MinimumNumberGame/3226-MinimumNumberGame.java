// Last updated: 7/9/2026, 7:40:25 AM
class Solution {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i+=2){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
        }
        return nums;
    }
}