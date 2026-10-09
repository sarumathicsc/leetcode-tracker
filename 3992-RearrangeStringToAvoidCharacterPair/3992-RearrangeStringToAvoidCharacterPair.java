// Last updated: 10/9/2026, 9:32:18 AM
class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[] counts = new int[26];
        for(int i=0; i <s.length();i++){
            counts[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i < 26;i++){
            char ch = (char)('a'+i);
            if(ch != x && ch != y){
                while(counts[i] > 0){
                    sb.append(ch);
                    counts[i]--;
                }
            }
        }

        while(counts[y - 'a'] > 0){
            sb.append(y);
            counts[y - 'a']--;
        }
        while(counts[x - 'a'] > 0){
            sb.append(x);
            counts[x - 'a']--;
        }
        return sb.toString();
    }
}