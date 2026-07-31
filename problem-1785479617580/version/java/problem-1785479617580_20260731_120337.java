// Last updated: 7/31/2026, 12:03:37 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] count = new int[26];
4        for (char c : word.toCharArray()) {
5            count[c - 'a']++;
6        }
7        
8        Arrays.sort(count);
9        
10        int totalPushes = 0;
11        int distinctCount = 0;
12        
13        for (int i = 25; i >= 0; i--) {
14            if (count[i] == 0) break;
15            
16            int pushesPerLetter = (distinctCount / 8) + 1;
17            totalPushes += count[i] * pushesPerLetter;
18            distinctCount++;
19        }
20        
21        return totalPushes;
22    }
23}
24