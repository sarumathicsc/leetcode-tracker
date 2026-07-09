// Last updated: 7/9/2026, 7:41:34 AM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            map.putIfAbsent(size, new ArrayList<>());
            List<Integer> currentGroup = map.get(size);
            
            currentGroup.add(i);
      
            if (currentGroup.size() == size) {
                result.add(currentGroup);
                map.put(size, new ArrayList<>());
            }
        }
        return result;
    }
}