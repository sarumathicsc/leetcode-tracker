// Last updated: 7/9/2026, 7:40:58 AM
import java.util.*;

class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] found = new int[3];

        for (int[] t : triplets) {
            if (t[0] <= target[0] &&
                t[1] <= target[1] &&
                t[2] <= target[2]) {

                found[0] = Math.max(found[0], t[0]);
                found[1] = Math.max(found[1], t[1]);
                found[2] = Math.max(found[2], t[2]);
            }
        }

        return found[0] == target[0] &&
               found[1] == target[1] &&
               found[2] == target[2];
    }
}