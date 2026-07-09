// Last updated: 7/9/2026, 7:40:35 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->Integer.compare(b[k],a[k]));
        return score;
    }
}