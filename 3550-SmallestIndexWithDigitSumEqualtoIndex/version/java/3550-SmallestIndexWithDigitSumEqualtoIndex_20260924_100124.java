// Last updated: 9/24/2026, 10:01:24 AM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            if (getDigitSum(nums[i]) == i) {
5                return i; 
6            }
7        }
8        return -1;
9    }
10
11    private int getDigitSum(int num) {
12        int sum = 0;
13        while (num > 0) {
14            sum += num % 10;
15            num /= 10;
16        }
17        return sum;
18    }
19}
20