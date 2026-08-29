// Last updated: 8/29/2026, 8:44:07 PM
1class Solution {
2    public int minBishopMoves(int[] source, int[] target) {
3        int sr = source[0];
4        int sc = source[1];
5
6        int tr = target[0];
7        int tc = target[1];
8
9        if((sr + sc) % 2 != (tr + tc)%2){
10            return -1;
11        }
12        if(Math.abs(sr - tr) == Math.abs(sc - tc)){
13            return 1;
14        }
15        return 2;
16    }
17}