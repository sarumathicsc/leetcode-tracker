// Last updated: 7/18/2026, 9:10:54 PM
1class Solution {
2    public int minCost(String source, String target, List<List<String>> rules, int[] costs) {
3        int n = source.length();
4        long[] dp =  new long[n+1];
5        Arrays.fill(dp, Long.MAX_VALUE);
6        dp[0] = 0;
7
8        int numrules = rules.size();
9        int[] wildcards = new int[numrules];
10        for(int i = 0; i < numrules; i++){
11            String pattern = rules.get(i).get(0);
12            int count = 0;
13            for(char c : pattern.toCharArray()){
14                if(c == '*') count++;
15            }
16            wildcards[i] = count;
17        }
18
19        Map<Integer,List<Integer>> rulesByLength = new HashMap<>();
20        for(int i = 0; i < numrules; i++){
21            int len = rules.get(i).get(0).length();
22            rulesByLength.computeIfAbsent(len, k -> new ArrayList<>()).add(i);
23        }
24        for(int i = 1; i <= n; i++){
25            if(source.charAt(i-1) == target.charAt(i-1)&& dp[i-1] != Long.MAX_VALUE){
26                dp[i] = Math.min(dp[i],dp[i-1]);
27            }
28            for(Map.Entry<Integer,List<Integer>> entry : rulesByLength.entrySet()){
29                int L = entry.getKey();
30                int start = i - L;
31                if(start < 0 || dp[start] == Long.MAX_VALUE){
32                    continue;
33                }
34                List<Integer> ruleIndices = entry.getValue();
35                for(int ruleIdx : ruleIndices){
36                    String pattern = rules.get(ruleIdx).get(0);
37                    String replacement = rules.get(ruleIdx).get(1);
38                    boolean match = true;
39                    for(int j = 0; j < L; j++){
40                        char pchar = pattern.charAt(j);
41                        char rchar = replacement.charAt(j);
42                        char schar = source.charAt(start + j);
43                        char tchar = target.charAt(start + j);
44                        if((pchar != '*' && pchar != schar) || rchar != tchar){
45                            match = false;
46                            break;
47                        }
48                    }
49                    if(match){
50                        long currentcost = (long)costs[ruleIdx] + wildcards[ruleIdx];
51                        dp[i] = Math.min(dp[i], dp[start] + currentcost);
52                    }
53                }
54            }
55        }
56        return dp[n] == Long.MAX_VALUE ? -1 :(int) dp[n];
57    }
58}