// Last updated: 8/6/2026, 9:48:41 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int x = n;
4        while (true) {
5            int product = 1;
6            int temp = x;
7            
8            while (temp > 0) {
9                product *= (temp % 10);
10                temp /= 10;
11            }
12            
13            if (product % t == 0) {
14                return x;
15            }
16            
17            x++;
18        }
19    }
20}
21