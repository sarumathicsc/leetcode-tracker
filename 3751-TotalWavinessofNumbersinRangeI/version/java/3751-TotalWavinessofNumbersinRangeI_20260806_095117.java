// Last updated: 8/6/2026, 9:51:17 AM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int totalWaviness = 0;
4        
5        for (int num = num1; num <= num2; num++) {
6            String s = Integer.toString(num);
7            int n = s.length();
8            
9            if (n < 3) continue;
10            
11            for (int i = 1; i < n - 1; i++) {
12                char curr = s.charAt(i);
13                char prev = s.charAt(i - 1);
14                char next = s.charAt(i + 1);
15                
16                if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
17                    totalWaviness++;
18                }
19            }
20        }
21        return totalWaviness;
22    }
23}
24