// Last updated: 10/9/2026, 9:36:45 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int subsequencecount = 1;
        int currentmin = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] - currentmin > k){
                subsequencecount++;
                currentmin = nums[i];
            }
        } 
        return subsequencecount;
    }
}