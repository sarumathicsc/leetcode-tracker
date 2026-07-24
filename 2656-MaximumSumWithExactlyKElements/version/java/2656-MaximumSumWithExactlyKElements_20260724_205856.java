// Last updated: 7/24/2026, 8:58:56 PM
1class Solution {
2    public int maximizeSum(int[] nums, int k) {
3        int maxele = nums[0];
4        for(int num : nums){
5            if(num > maxele){
6                maxele = num;
7            }
8        }
9        return (maxele*k)+(k*(k-1)/2);
10    }
11}