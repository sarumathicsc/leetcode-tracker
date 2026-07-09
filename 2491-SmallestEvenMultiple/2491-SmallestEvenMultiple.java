// Last updated: 7/9/2026, 7:40:39 AM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        else{
            return n*2;
        }
    }
}