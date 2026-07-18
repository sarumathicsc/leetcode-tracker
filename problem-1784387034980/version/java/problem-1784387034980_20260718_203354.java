// Last updated: 7/18/2026, 8:33:54 PM
1class Solution {
2    public long maximumValue(int n, int s, int m) {
3        long maxval = s;
4
5        long maxoddindex = (n%2==0) ? (n - 1) : (n - 2);
6        if(maxoddindex >= 1){
7            long ups = (maxoddindex + 1) / 2;
8            long down = (maxoddindex - 1) / 2;
9            long valodd = s + ups * m - down;
10            maxval = Math.max(maxval,valodd);
11        }
12
13        long maxevenindex = ( n % 2 == 0) ? (n - 2) : (n - 1);
14        if(maxevenindex >= 2){
15            long pairs = maxevenindex / 2;
16            long valeven = s + pairs * (m - 1);
17            maxval = Math.max(maxval,valeven);
18        }
19        return maxval;
20        
21    }
22}