// Last updated: 10/9/2026, 9:32:43 AM
class Solution {
    public int maxDistance(String moves) {
        int u = 0, d = 0, l = 0, r = 0, blank = 0;

        for(char c : moves.toCharArray()){
            if(c == 'U') u++;
            else if(c == 'D') d++;
            else if(c == 'L') l++;
            else if(c == 'R') r++;
            else blank++;
        }

        int vertical = Math.abs(u - d);
        int horizontal = Math.abs(l - r);

        return vertical + horizontal + blank;
    }
}