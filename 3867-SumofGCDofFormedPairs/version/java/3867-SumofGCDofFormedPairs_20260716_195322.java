// Last updated: 7/16/2026, 7:53:22 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int n = nums.length;
4        int[] prefixGcd = new int[n];
5        
6        int maxVal = 0;
7        for (int i = 0; i < n; i++) {
8            maxVal = Math.max(maxVal, nums[i]);
9            prefixGcd[i] = gcd(nums[i], maxVal);
10        }
11        
12        Arrays.sort(prefixGcd);
13        
14        long totalSum = 0;
15        int left = 0;
16        int right = n - 1;
17        
18        while (left < right) {
19            totalSum += gcd(prefixGcd[left], prefixGcd[right]);
20            left++;
21            right--;
22        }
23        
24        return totalSum;
25    }
26    
27    private int gcd(int a, int b) {
28        while (b != 0) {
29            int temp = b;
30            b = a % b;
31            a = temp;
32        }
33        return a;
34    }
35}