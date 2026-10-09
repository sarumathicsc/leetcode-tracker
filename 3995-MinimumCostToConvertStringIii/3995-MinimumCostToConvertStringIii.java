// Last updated: 10/9/2026, 9:33:43 AM
class Solution {
    public int minCost(String source, String target, List<List<String>> rules, int[] costs) {
        int n = source.length();
        long[] dp =  new long[n+1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;

        int numrules = rules.size();
        int[] wildcards = new int[numrules];
        for(int i = 0; i < numrules; i++){
            String pattern = rules.get(i).get(0);
            int count = 0;
            for(char c : pattern.toCharArray()){
                if(c == '*') count++;
            }
            wildcards[i] = count;
        }

        Map<Integer,List<Integer>> rulesByLength = new HashMap<>();
        for(int i = 0; i < numrules; i++){
            int len = rules.get(i).get(0).length();
            rulesByLength.computeIfAbsent(len, k -> new ArrayList<>()).add(i);
        }
        for(int i = 1; i <= n; i++){
            if(source.charAt(i-1) == target.charAt(i-1)&& dp[i-1] != Long.MAX_VALUE){
                dp[i] = Math.min(dp[i],dp[i-1]);
            }
            for(Map.Entry<Integer,List<Integer>> entry : rulesByLength.entrySet()){
                int L = entry.getKey();
                int start = i - L;
                if(start < 0 || dp[start] == Long.MAX_VALUE){
                    continue;
                }
                List<Integer> ruleIndices = entry.getValue();
                for(int ruleIdx : ruleIndices){
                    String pattern = rules.get(ruleIdx).get(0);
                    String replacement = rules.get(ruleIdx).get(1);
                    boolean match = true;
                    for(int j = 0; j < L; j++){
                        char pchar = pattern.charAt(j);
                        char rchar = replacement.charAt(j);
                        char schar = source.charAt(start + j);
                        char tchar = target.charAt(start + j);
                        if((pchar != '*' && pchar != schar) || rchar != tchar){
                            match = false;
                            break;
                        }
                    }
                    if(match){
                        long currentcost = (long)costs[ruleIdx] + wildcards[ruleIdx];
                        dp[i] = Math.min(dp[i], dp[start] + currentcost);
                    }
                }
            }
        }
        return dp[n] == Long.MAX_VALUE ? -1 :(int) dp[n];
    }
}