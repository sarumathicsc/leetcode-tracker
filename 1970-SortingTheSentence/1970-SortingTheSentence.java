// Last updated: 7/9/2026, 7:41:02 AM
class Solution {
    public String sortSentence(String s) {
        String[] word = s.split(" ");
        String[] sortedword = new String[word.length];

        for(String words : word){
            int len = words.length();
            int index = words.charAt(len-1)-'1';
            sortedword[index] = words.substring(0,len-1);
        }
        return String.join(" ",sortedword);
    }
}