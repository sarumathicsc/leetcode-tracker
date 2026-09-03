// Last updated: 9/3/2026, 12:34:30 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int minOdd = Integer.MAX_VALUE;
4        int minEven = Integer.MAX_VALUE;
5
6        for (int x : nums1) {
7            if (x % 2 != 0) {
8                if (x < minOdd) {
9                    minOdd = x;
10                }
11            } else {
12                if (x < minEven) {
13                    minEven = x;
14                }
15            }
16        }
17        
18        if (minOdd == Integer.MAX_VALUE) {
19            return true;
20        }
21        
22        if (minEven < minOdd) {
23            return false;
24        }
25        
26        return true;
27    }
28}
29