// Last updated: 10/9/2026, 9:33:48 AM
class Solution {
    public int maxDistinct(String s) {
        int distinctcount = 0;
        boolean[] seen = new boolean[26];

        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(!seen[index]){
                seen[index] = true;
                distinctcount++;
            }
        }
        return distinctcount;
    }
}