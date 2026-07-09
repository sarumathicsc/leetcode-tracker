// Last updated: 7/9/2026, 7:41:13 AM
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xcoords = new int[points.length];

        for(int i = 0; i < points.length; i++){
            xcoords[i] = points[i][0];
        }

        Arrays.sort(xcoords);

        int maxgap = 0;

        for(int i = 1; i < xcoords.length; i++){
            int gap = xcoords[i] - xcoords[i-1];
            if(gap > maxgap){
                maxgap = gap;
            }
        }
        return maxgap;
    }
}