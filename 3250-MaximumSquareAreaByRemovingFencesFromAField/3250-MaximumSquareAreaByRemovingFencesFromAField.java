// Last updated: 7/9/2026, 7:40:24 AM
import java.util.*;

public class Solution {
    private static final long MOD = 1_000_000_007L;

    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int[] h = new int[hFences.length + 2];
        int[] v = new int[vFences.length + 2];

        h[0] = 1; h[h.length - 1] = m;
        v[0] = 1; v[v.length - 1] = n;

        System.arraycopy(hFences, 0, h, 1, hFences.length);
        System.arraycopy(vFences, 0, v, 1, vFences.length);

        Arrays.sort(h);
        Arrays.sort(v);

        HashSet<Integer> hDist = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                hDist.add(h[j] - h[i]);
            }
        }

        int maxCommon = -1;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int d = v[j] - v[i];
                if (hDist.contains(d) && d > maxCommon) {
                    maxCommon = d;
                }
            }
        }

        if (maxCommon == -1) return -1;
        long area = (long) maxCommon * (long) maxCommon % MOD;
        return (int) area;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximizeSquareArea(4, 3, new int[]{2,3}, new int[]{2})); // 4
        System.out.println(s.maximizeSquareArea(6, 7, new int[]{2}, new int[]{4}));   // -1
    }
}