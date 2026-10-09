// Last updated: 10/9/2026, 9:37:17 AM
class Solution {
    public int minTimeToType(String word) {
        int totalSeconds = 0;
        char currentLetter = 'a'; 
        
        for (char targetLetter : word.toCharArray()) {
            int diff = Math.abs(targetLetter - currentLetter);
            totalSeconds += Math.min(diff, 26 - diff);
            totalSeconds += 1;          
            currentLetter = targetLetter;
        }       
        return totalSeconds;
    }
}