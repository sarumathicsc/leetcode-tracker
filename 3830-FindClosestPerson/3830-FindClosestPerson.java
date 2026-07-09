// Last updated: 7/9/2026, 7:40:09 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int distanceX = Math.abs(x-z);
        int distanceY = Math.abs(y-z);

        if(distanceX < distanceY){
            return 1;
        }
        else if(distanceY < distanceX){
            return 2;
        }
        else{
            return 0;
        }
    }
}