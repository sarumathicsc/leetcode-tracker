// Last updated: 10/9/2026, 9:36:21 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(a,b)->Integer.compare(b[k],a[k]));
        return score;
    }
}