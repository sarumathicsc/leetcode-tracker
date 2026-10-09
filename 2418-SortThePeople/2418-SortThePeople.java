// Last updated: 10/9/2026, 9:36:30 AM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        int n = names.length;
        for(int i = 0; i < n; i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);

        String[] result = new String[n];
        for(int i = 0; i < n; i++){
            result[i] = map.get(heights[n-1-i]);
        }
        return result;
    }
}