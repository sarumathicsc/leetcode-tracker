// Last updated: 7/9/2026, 7:40:18 AM
import java.util.PriorityQueue;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); 
            }
            return Integer.compare(a[1], b[1]); 
        });

        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new int[]{nums[i], i});
        }

        for (int i = 0; i < k; i++) {
            int[] current = minHeap.poll();
            int val = current[0];
            int index = current[1];

            nums[index] = val * multiplier;

            minHeap.offer(new int[]{nums[index], index});
        }

        return nums;
    }
}
