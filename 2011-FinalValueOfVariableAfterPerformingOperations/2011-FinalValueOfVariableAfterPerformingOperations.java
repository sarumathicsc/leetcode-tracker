// Last updated: 10/9/2026, 9:37:09 AM
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