// Last updated: 7/21/2026, 8:39:58 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] excepted = heights.clone();
4        Arrays.sort(excepted);
5        int mismatchcount = 0;
6
7        for(int i = 0; i < heights.length;i++){
8            if(heights[i] != excepted[i]){
9                mismatchcount++;
10            }
11        }
12        return mismatchcount;
13    }
14}