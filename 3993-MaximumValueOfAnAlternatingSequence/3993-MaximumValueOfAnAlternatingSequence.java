// Last updated: 10/9/2026, 9:32:05 AM
class Solution {
    public long maximumValue(int n, int s, int m) {
        long maxval = s;

        long maxoddindex = (n%2==0) ? (n - 1) : (n - 2);
        if(maxoddindex >= 1){
            long ups = (maxoddindex + 1) / 2;
            long down = (maxoddindex - 1) / 2;
            long valodd = s + ups * m - down;
            maxval = Math.max(maxval,valodd);
        }

        long maxevenindex = ( n % 2 == 0) ? (n - 2) : (n - 1);
        if(maxevenindex >= 2){
            long pairs = maxevenindex / 2;
            long valeven = s + pairs * (m - 1);
            maxval = Math.max(maxval,valeven);
        }
        return maxval;
        
    }
}