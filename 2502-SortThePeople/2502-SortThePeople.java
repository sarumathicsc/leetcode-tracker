// Last updated: 7/9/2026, 7:40:38 AM
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