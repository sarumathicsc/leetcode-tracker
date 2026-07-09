// Last updated: 7/9/2026, 7:40:51 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("--X")){
                X = X - 1;
            }
            if(operations[i].equals("X--")){
                X = X - 1;
            }
            if(operations[i].equals("X++")){
                X = X + 1;
            }
            if(operations[i].equals("++X")){
                X = X + 1;
            }
        }
        return X;
    }
}