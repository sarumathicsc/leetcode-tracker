// Last updated: 7/21/2026, 6:40:42 PM
1import java.util.*;
2
3public class Solution {
4    public int maxActiveSectionsAfterTrade(String s) {
5        int initialOnes = 0;
6        for (int i = 0; i < s.length(); i++) {
7            if (s.charAt(i) == '1') {
8                initialOnes++;
9            }
10        }
11        
12        String t = "1" + s + "1";
13        
14        List<Integer> blocks = new ArrayList<>();
15        int currentLen = 1;
16        for (int i = 1; i < t.length(); i++) {
17            if (t.charAt(i) == t.charAt(i - 1)) {
18                currentLen++;
19            } else {
20                blocks.add(currentLen); 
21                currentLen = 1;
22            }
23        }
24        blocks.add(currentLen);
25        
26        if (blocks.size() < 5) {
27            return initialOnes;
28        }
29        
30        int nBlocks = blocks.size();
31        int maxOnes = initialOnes;
32        
33        List<ZeroBlock> zeroBlocks = new ArrayList<>();
34        for (int i = 1; i < nBlocks; i += 2) {
35            zeroBlocks.add(new ZeroBlock(blocks.get(i), i));
36        }
37        
38        zeroBlocks.sort((a, b) -> Integer.compare(b.length, a.length));
39        
40        for (int i = 2; i < nBlocks - 2; i += 2) {
41            int oneLen = blocks.get(i);
42            int zLeftIdx = i - 1;
43            int zRightIdx = i + 1; 
44            
45            int gainA = blocks.get(zLeftIdx) + blocks.get(zRightIdx);
46            maxOnes = Math.max(maxOnes, initialOnes + gainA);
47            
48            for (ZeroBlock zBlock : zeroBlocks) {
49                if (zBlock.index != zLeftIdx && zBlock.index != zRightIdx) {
50                    int gainB = zBlock.length - oneLen;
51                    maxOnes = Math.max(maxOnes, initialOnes + gainB);
52                    break; 
53                }
54            }
55        }
56        
57        return maxOnes;
58    }
59    
60    private static class ZeroBlock {
61        int length;
62        int index;
63        
64        ZeroBlock(int length, int index) {
65            this.length = length;
66            this.index = index;
67        }
68    }
69}
70