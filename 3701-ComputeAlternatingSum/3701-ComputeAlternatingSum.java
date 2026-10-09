// Last updated: 10/9/2026, 9:33:51 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 == 0){
                sum += nums[i];
            }else{
                sum -= nums[i];
            }
        }
        return sum;
    }
}