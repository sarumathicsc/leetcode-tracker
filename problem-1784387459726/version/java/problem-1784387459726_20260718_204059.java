// Last updated: 7/18/2026, 8:40:59 PM
1class Solution {
2    public int minAdjacentSwaps(int[] nums, int a, int b) {
3        long swaps = 0;
4        long count0 = 0;
5        long count1 = 0;
6        long count2 = 0;
7        long MOD = 1_000_000_007;
8
9        for(int num : nums){
10            if(num < a){
11                swaps = (swaps + count1 + count2) % MOD;
12                count0++;
13            }else if(num <= b){
14                swaps = (swaps + count2);
15                count1++;
16            }else{
17                count2++;
18            }
19        }
20        return (int) swaps;
21    }
22}