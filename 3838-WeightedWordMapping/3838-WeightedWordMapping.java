// Last updated: 10/9/2026, 9:33:27 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            int totalWeight = 0;
            
            for (int i = 0; i < word.length(); i++) {
                int charIndex = word.charAt(i) - 'a';
                totalWeight += weights[charIndex];
            }
            
            int remainder = totalWeight % 26;
            
            char mappedChar = (char) ('z' - remainder);
            
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}