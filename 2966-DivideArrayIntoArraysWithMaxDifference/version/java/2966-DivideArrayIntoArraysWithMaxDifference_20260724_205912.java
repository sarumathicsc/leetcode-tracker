// Last updated: 7/24/2026, 8:59:12 PM
1class Solution {
2    public int[][] divideArray(int[] nums, int k) {
3    
4    int[][] ans = new int[nums.length / 3][3];
5
6    Arrays.sort(nums);
7
8    for (int i = 2; i < nums.length; i += 3) {
9      if (nums[i] - nums[i - 2] > k)
10        return new int[0][];
11      ans[i / 3] = new int[] {nums[i - 2], nums[i - 1], nums[i]};
12    }
13    return ans;
14    }
15}