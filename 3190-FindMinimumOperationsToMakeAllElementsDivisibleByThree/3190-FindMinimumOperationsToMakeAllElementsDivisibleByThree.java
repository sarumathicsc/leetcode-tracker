// Last updated: 10/9/2026, 9:35:04 AM
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