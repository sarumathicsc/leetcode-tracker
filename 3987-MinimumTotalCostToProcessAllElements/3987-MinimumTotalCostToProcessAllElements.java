// Last updated: 10/9/2026, 9:32:28 AM
class Solution {
    public int minimumCost(int[] nums, int k) {
        long totalsum = 0;
        for(int num : nums){
            totalsum += num;
        }

        if(totalsum <= k){
            return 0;
        }

        long M = (totalsum - 1)/k;
        long MOD = 1_000_000_007;
        M %= MOD;

        long totalcost = (M*(M+1)/2) % MOD;
        return (int) totalcost;
    }
}