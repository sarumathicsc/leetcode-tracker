// Last updated: 7/9/2026, 7:41:17 AM
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int totalcoins = 0;
        int n = piles.length / 3;

        for(int i = piles.length - 2; i >= n;i -= 2){
            totalcoins += piles[i];
        }
        return totalcoins;
    }
}