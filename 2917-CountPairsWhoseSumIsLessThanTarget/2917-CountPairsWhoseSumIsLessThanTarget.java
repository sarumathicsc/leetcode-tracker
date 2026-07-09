// Last updated: 7/9/2026, 7:40:30 AM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();
        for(int i = 0; i < n; i++){
            for(int j = i+1 ; j < n; j++){
                if(nums.get(i)+nums.get(j) <  target){
                    count++;
                }
            }
        }
        return count;
    }
}