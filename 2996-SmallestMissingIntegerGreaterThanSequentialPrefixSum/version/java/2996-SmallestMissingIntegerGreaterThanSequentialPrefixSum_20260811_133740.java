// Last updated: 8/11/2026, 1:37:40 PM
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public int missingInteger(int[] nums) {
6        int prefixSum = nums[0];
7        for (int i = 1; i < nums.length; i++) {
8            if (nums[i] == nums[i - 1] + 1) {
9                prefixSum += nums[i];
10            } else {
11                break;
12            }
13        }
14        
15        Set<Integer> numSet = new HashSet<>();
16        for (int num : nums) {
17            numSet.add(num);
18        }
19        
20        while (numSet.contains(prefixSum)) {
21            prefixSum++;
22        }
23        
24        return prefixSum;
25    }
26}
27