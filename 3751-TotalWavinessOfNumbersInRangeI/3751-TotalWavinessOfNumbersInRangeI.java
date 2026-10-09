// Last updated: 10/9/2026, 9:33:52 AM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalWaviness = 0;
        
        for (int num = num1; num <= num2; num++) {
            String s = Integer.toString(num);
            int n = s.length();
            
            if (n < 3) continue;
            
            for (int i = 1; i < n - 1; i++) {
                char curr = s.charAt(i);
                char prev = s.charAt(i - 1);
                char next = s.charAt(i + 1);
                
                if ((curr > prev && curr > next) || (curr < prev && curr < next)) {
                    totalWaviness++;
                }
            }
        }
        return totalWaviness;
    }
}
