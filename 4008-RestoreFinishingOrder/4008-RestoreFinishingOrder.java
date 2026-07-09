// Last updated: 7/9/2026, 7:40:06 AM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int[] ordered = new int[n];
        int index = 0;

        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++)
            if(order[i] == friends[j]){
                ordered[index] = order[i];
                index++;
                break;
            }
        }
        return ordered;
    }
}