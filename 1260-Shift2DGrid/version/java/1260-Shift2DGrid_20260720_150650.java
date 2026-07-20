// Last updated: 7/20/2026, 3:06:50 PM
1import java.util.*;
2class Solution {
3    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
4        int m = grid.length;
5        int n = grid[0].length;
6        int totalElements = m * n;
7        k = k % totalElements; 
8        int[][] tempResult = new int[m][n];
9        for (int r = 0; r < m; r++) {
10            for (int c = 0; c < n; c++) {
11                int flatIndex = r * n + c;
12                int newFlatIndex = (flatIndex + k) % totalElements;
13                
14                int newR = newFlatIndex / n;
15                int newC = newFlatIndex % n;
16                
17                tempResult[newR][newC] = grid[r][c];
18            }
19        }
20        List<List<Integer>> result = new ArrayList<>();
21        for (int[] row : tempResult) {
22            List<Integer> listRow = new ArrayList<>();
23            for (int val : row) {
24                listRow.add(val);
25            }
26            result.add(listRow);
27        }
28        return result;
29    }
30}
31