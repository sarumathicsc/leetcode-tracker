// Last updated: 8/22/2026, 4:16:46 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int digitSum = 0;
4        int digitProduct = 1;
5        int x = n;
6        
7        while (x > 0) {
8            int digit = x % 10;
9            digitSum += digit;
10            digitProduct *= digit;
11            x /= 10;
12        }
13        
14        return n % (digitSum + digitProduct) == 0;
15    }
16}
17