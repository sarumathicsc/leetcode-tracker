// Last updated: 7/9/2026, 7:41:09 AM
class Solution {
    public int minPartitions(String n) {
        int max = '0';
        for(int i = 0; i < n.length(); i++){
            int current = n.charAt(i);
            if(current > max){
                max = current;
            }
            if(max == '9'){
                return 9;
            }
        }
        return max - '0';
    }
}