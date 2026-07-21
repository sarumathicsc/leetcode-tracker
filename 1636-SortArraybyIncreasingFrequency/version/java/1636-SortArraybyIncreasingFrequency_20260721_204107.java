// Last updated: 7/21/2026, 8:41:07 PM
1class Solution {
2    public int[] frequencySort(int[] nums) {
3        Map<Integer, Integer> frequencyMap = new HashMap<>();
4        for (int num : nums) {
5            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
6        }
7
8        Integer[] numsBoxed = new Integer[nums.length];
9        for (int i = 0; i < nums.length; i++) {
10            numsBoxed[i] = nums[i];
11        }
12        Arrays.sort(numsBoxed, (a, b) -> {
13            int freqA = frequencyMap.get(a);
14            int freqB = frequencyMap.get(b);
15            if (freqA != freqB) {
16                return Integer.compare(freqA, freqB);
17            }
18            return Integer.compare(b, a);
19        });
20
21        for (int i = 0; i < nums.length; i++) {
22            nums[i] = numsBoxed[i];
23        }
24        return nums;
25    }
26}