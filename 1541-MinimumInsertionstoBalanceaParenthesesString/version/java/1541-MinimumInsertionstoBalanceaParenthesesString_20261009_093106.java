// Last updated: 10/9/2026, 9:31:06 AM
1class Solution {
2    public int minInsertions(String s) {
3        int insertions = 0;   
4        int neededRight = 0;  
5        
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8            
9            if (c == '(') {
10                if (neededRight % 2 != 0) {
11                    insertions++;  
12                    neededRight--;  
13                }
14                neededRight += 2;   
15            } else { 
16                neededRight--;
17                
18                if (neededRight < 0) {
19                    insertions++;   
20                    neededRight += 2; 
21                }
22            }
23        }
24        
25        return insertions + neededRight;
26    }
27}
28