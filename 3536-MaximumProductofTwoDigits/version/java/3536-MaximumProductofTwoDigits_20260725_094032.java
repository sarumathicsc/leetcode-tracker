// Last updated: 7/25/2026, 9:40:32 AM
1class Solution {
2    public int maxProduct(int n) {
3         int max1 = 0;
4        int max2 = 0;
5        
6        while (n > 0) {
7            int digit = n % 10;
8            n /= 10;
9            
10            if (digit > max1) {
11                max2 = max1;
12                max1 = digit;
13            } else if (digit > max2) {
14                max2 = digit;
15            }
16        }
17        return max1 * max2;
18    }
19}