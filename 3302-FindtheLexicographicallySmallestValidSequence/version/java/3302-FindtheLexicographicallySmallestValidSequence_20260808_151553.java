// Last updated: 8/8/2026, 3:15:53 PM
1import java.util.*;
2
3class Solution {
4    public int[] validSequence(String word1, String word2) {
5        int n = word1.length();
6        int m = word2.length();
7        
8        int[] last = new int[m];
9        Arrays.fill(last, -1);
10        
11        int i = n - 1, j = m - 1;
12        while (i >= 0 && j >= 0) {
13            if (word1.charAt(i) == word2.charAt(j)) {
14                last[j] = i;
15                j--;
16            }
17            i--;
18        }
19        
20        List<Integer> list = new ArrayList<>();
21        boolean canSkip = true;
22        j = 0;
23        
24        for (i = 0; i < n && j < m; i++) {
25            if (word1.charAt(i) == word2.charAt(j)) {
26                list.add(i);
27                j++;
28            } else if (canSkip && (j == m - 1 || i + 1 <= last[j + 1])) {
29                list.add(i);
30                canSkip = false;
31                j++;
32            }
33        }
34        
35        if (list.size() != m) return new int[0];
36        
37        int[] ans = new int[m];
38        for (int k = 0; k < m; k++) ans[k] = list.get(k);
39        return ans;
40    }
41}
42