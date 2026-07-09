// Last updated: 7/9/2026, 7:40:02 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        if(nums == null || nums.length < 2){
            return missing;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] > nums[i]+1){
                for(int j = nums[i]+1; j < nums[i+1]; j++){
                    missing.add(j);
                }
            }
        }
        return missing;
    }
}