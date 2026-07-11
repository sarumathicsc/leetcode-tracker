// Last updated: 7/11/2026, 4:22:57 PM
1class Solution {
2    public int minTimeToType(String word) {
3        int totalSeconds = 0;
4        char currentLetter = 'a'; 
5        
6        for (char targetLetter : word.toCharArray()) {
7            int diff = Math.abs(targetLetter - currentLetter);
8            totalSeconds += Math.min(diff, 26 - diff);
9            totalSeconds += 1;          
10            currentLetter = targetLetter;
11        }       
12        return totalSeconds;
13    }
14}