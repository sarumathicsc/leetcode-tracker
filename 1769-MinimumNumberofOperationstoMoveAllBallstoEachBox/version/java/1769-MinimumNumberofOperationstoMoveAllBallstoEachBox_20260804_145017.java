// Last updated: 8/4/2026, 2:50:17 PM
1class Solution {
2    public int[] minOperations(String boxes) {
3        int n = boxes.length();
4        int[] ans = new int[n];
5        
6        int balls = 0;
7        int operations = 0;
8        for (int i = 0; i < n; i++) {
9            ans[i] += operations;
10            if (boxes.charAt(i) == '1') {
11                balls++;
12            }
13            operations += balls;
14        }
15        
16        balls = 0;
17        operations = 0;
18        for (int i = n - 1; i >= 0; i--) {
19            ans[i] += operations;
20            if (boxes.charAt(i) == '1') {
21                balls++;
22            }
23            operations += balls;
24        }
25        
26        return ans;
27    }
28}
29