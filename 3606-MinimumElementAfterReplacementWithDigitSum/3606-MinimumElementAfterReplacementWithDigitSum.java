// Last updated: 7/9/2026, 7:40:14 AM
class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        
        for(int num : nums){
            int currentsum = 0;
            while(num > 0){
                currentsum += num % 10;
                num /= 10;
            }
            if(currentsum < minSum){
                minSum = currentsum;
            }
        }
        return minSum;
    }
}