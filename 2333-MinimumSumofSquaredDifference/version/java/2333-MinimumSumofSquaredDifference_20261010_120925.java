// Last updated: 10/10/2026, 12:09:25 PM
1import java.util.Arrays;
2
3class Solution {
4    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
5        long k = (long) k1 + k2;
6        int n = nums1.length;
7        
8        int maxDiff = 0;
9        for (int i = 0; i < n; i++) {
10            maxDiff = Math.max(maxDiff, Math.abs(nums1[i] - nums2[i]));
11        }
12        
13        if (maxDiff == 0) {
14            return 0;
15        }
16        
17        long[] buckets = new long[maxDiff + 1];
18        long totalDiffSum = 0;
19        
20        for (int i = 0; i < n; i++) {
21            int diff = Math.abs(nums1[i] - nums2[i]);
22            if (diff > 0) {
23                buckets[diff]++;
24                totalDiffSum += diff;
25            }
26        }
27        
28        if (totalDiffSum <= k) {
29            return 0;
30        }
31        
32        for (int d = maxDiff; d > 0; d--) {
33            if (buckets[d] == 0) {
34                continue;
35            }
36            
37            long take = Math.min(k, buckets[d]);
38            buckets[d] -= take;
39            buckets[d - 1] += take;
40            k -= take;
41            
42            if (k == 0) {
43                break;
44            }
45        }
46        
47        long minSumSquare = 0;
48        for (int d = 1; d <= maxDiff; d++) {
49            if (buckets[d] > 0) {
50                minSumSquare += buckets[d] * ((long) d * d);
51            }
52        }
53        
54        return minSumSquare;
55    }
56}
57