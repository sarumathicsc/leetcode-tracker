// Last updated: 7/9/2026, 7:40:20 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for(int num : nums){
            if(num%3 != 0){
                operations++;
            }
        }
        return operations;
    }
}