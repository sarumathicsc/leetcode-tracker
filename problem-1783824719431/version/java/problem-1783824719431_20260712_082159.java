// Last updated: 7/12/2026, 8:21:59 AM
1class Solution {
2    public int minimumCost(int[] nums, int k) {
3        long totalsum = 0;
4        for(int num : nums){
5            totalsum += num;
6        }
7
8        if(totalsum <= k){
9            return 0;
10        }
11
12        long M = (totalsum - 1)/k;
13        long MOD = 1_000_000_007;
14        M %= MOD;
15
16        long totalcost = (M*(M+1)/2) % MOD;
17        return (int) totalcost;
18    }
19}