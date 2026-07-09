// Last updated: 7/9/2026, 7:40:16 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int[] count = new int[nums.length];
        int index = 0;

        for(int num : nums){
            count[num]++;
            if(count[num] == 2){
                result[index++] = num;
            }
        }
        return result;
    }
}