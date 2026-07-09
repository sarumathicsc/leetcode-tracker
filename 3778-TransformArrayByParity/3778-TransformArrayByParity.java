// Last updated: 7/9/2026, 7:40:10 AM
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                nums[i] = 1;
            }else{
                nums[i] = 0;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}