// Last updated: 8/10/2026, 11:46:32 AM
1import java.util.*;
2
3class Solution {
4    private Boolean[] memo;
5
6    public boolean winnerSquareGame(int n) {
7        memo = new Boolean[n + 1];
8        return canWin(n);
9    }
10
11    private boolean canWin(int remain) {
12        if (remain == 0) return false;
13        if (memo[remain] != null) return memo[remain];
14
15        for (int k = 1; k * k <= remain; k++) {
16            if (!canWin(remain - k * k)) {
17                return memo[remain] = true;
18            }
19        }
20
21        return memo[remain] = false;
22    }
23}
24