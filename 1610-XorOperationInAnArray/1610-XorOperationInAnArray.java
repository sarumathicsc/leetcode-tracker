// Last updated: 7/9/2026, 7:41:20 AM
class Solution {
    public int xorOperation(int n, int start) {
        int ans =  0;
        for(int i = 0; i < n; i++){
            ans ^= (start+2*i);
        }
        return ans;
    }
}