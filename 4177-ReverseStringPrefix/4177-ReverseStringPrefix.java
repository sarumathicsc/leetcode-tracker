// Last updated: 7/9/2026, 7:39:59 AM
class Solution {
    public String reversePrefix(String s, int k) {
        if (s == null || k <= 1 || k > s.length()) {
            return s;
        }
        
        String reversedPrefix = new StringBuilder(s.substring(0, k)).reverse().toString();
        
        return reversedPrefix + s.substring(k);
    }
}
