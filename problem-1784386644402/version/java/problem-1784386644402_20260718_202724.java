// Last updated: 7/18/2026, 8:27:24 PM
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        int[] counts = new int[26];
4        for(int i=0; i <s.length();i++){
5            counts[s.charAt(i) - 'a']++;
6        }
7
8        StringBuilder sb = new StringBuilder();
9        for(int i =0; i < 26;i++){
10            char ch = (char)('a'+i);
11            if(ch != x && ch != y){
12                while(counts[i] > 0){
13                    sb.append(ch);
14                    counts[i]--;
15                }
16            }
17        }
18
19        while(counts[y - 'a'] > 0){
20            sb.append(y);
21            counts[y - 'a']--;
22        }
23        while(counts[x - 'a'] > 0){
24            sb.append(x);
25            counts[x - 'a']--;
26        }
27        return sb.toString();
28    }
29}