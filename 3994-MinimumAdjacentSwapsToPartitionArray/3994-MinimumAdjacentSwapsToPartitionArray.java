// Last updated: 10/9/2026, 9:32:47 AM
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long swaps = 0;
        long count0 = 0;
        long count1 = 0;
        long count2 = 0;
        long MOD = 1_000_000_007;

        for(int num : nums){
            if(num < a){
                swaps = (swaps + count1 + count2) % MOD;
                count0++;
            }else if(num <= b){
                swaps = (swaps + count2);
                count1++;
            }else{
                count2++;
            }
        }
        return (int) swaps;
    }
}