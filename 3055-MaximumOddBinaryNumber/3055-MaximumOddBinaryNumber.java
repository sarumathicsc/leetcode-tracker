// Last updated: 7/9/2026, 7:40:29 AM
class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onesCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') onesCount++;
        }
        int zerosCount = s.length() - onesCount;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < onesCount - 1; i++) sb.append('1');
        for (int i = 0; i < zerosCount; i++) sb.append('0');
        sb.append('1');
        
        return sb.toString();
    }
}