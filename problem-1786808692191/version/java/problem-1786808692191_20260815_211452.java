// Last updated: 8/15/2026, 9:14:52 PM
1class Solution {
2    public int minOperations(String s) {
3        int n = s.length();
4        int ans = Integer.MAX_VALUE;
5
6        for(int r = 0; r < n; r++){
7            int operations = r;
8            for(int i = 0; i < n/2; i++){
9                char a = s.charAt((i+r)%n);
10                char b = s.charAt((n-1-i+r)%n);
11
12                int diff = Math.abs(a-b);
13
14                operations += Math.min(diff, 26-diff);
15            }
16            ans = Math.min(ans, operations);
17        }
18        return ans;
19    }
20}