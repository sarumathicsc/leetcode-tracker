// Last updated: 7/9/2026, 7:40:13 AM
import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                diagonals.computeIfAbsent(i - j, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }
        
        for (int key : diagonals.keySet()) {
            if (key >= 0) {
                diagonals.get(key).sort(Collections.reverseOrder());
            } else {
                Collections.sort(diagonals.get(key));
            }
        }
        
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int idx = indexMap.getOrDefault(key, 0);
                grid[i][j] = diagonals.get(key).get(idx);
                indexMap.put(key, idx + 1);
            }
        }
        
        return grid;
    }
}
