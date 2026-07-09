// Last updated: 7/9/2026, 7:41:10 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedchar = new boolean[26];
        for(int i = 0 ; i < allowed.length(); i++){
            allowedchar[allowed.charAt(i) - 'a'] = true;
        }

        int consistentword = 0;

        for(String word : words){
            boolean isconsistent = true;
            for(int i = 0; i < word.length(); i++){
                if(!allowedchar[word.charAt(i) - 'a']){
                    isconsistent = false;
                    break;
                }
            }
            if(isconsistent){
                consistentword++;
            }
        }
        return consistentword;
    }
}