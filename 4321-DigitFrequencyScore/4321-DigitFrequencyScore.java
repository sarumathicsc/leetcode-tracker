// Last updated: 7/9/2026, 7:39:49 AM
class Solution {
    public int digitFrequencyScore(int n) {
        if(n==0){
            return 0;
        }
        int[] freq = new int[10];

        int temp = n;
        while(temp > 0){
            freq[temp%10]++;
            temp /= 10;
        }

        int score = 0;
        for(int i = 0; i <= 9; i++){
            score += i * freq[i];
        }
        return score;

    }
}