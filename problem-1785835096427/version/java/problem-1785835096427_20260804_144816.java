// Last updated: 8/4/2026, 2:48:16 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findMissingElements(int[] nums) {
5        Set<Integer> numSet = new HashSet<>();
6        int minVal = Integer.MAX_VALUE;
7        int maxVal = Integer.MIN_VALUE;
8
9        for (int num : nums) {
10            numSet.add(num);
11            if (num < minVal) minVal = num;
12            if (num > maxVal) maxVal = num;
13        }
14        
15        List<Integer> missingElements = new ArrayList<>();
16        
17        for (int i = minVal + 1; i < maxVal; i++) {
18            if (!numSet.contains(i)) {
19                missingElements.add(i);
20            }
21        }
22        
23        return missingElements;
24    }
25}
26