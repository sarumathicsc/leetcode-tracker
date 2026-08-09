// Last updated: 8/9/2026, 8:59:49 AM
1class Solution {
2    public long weightedSum(int[] parent, int[] nums) {
3        int n = parent.length;
4        ArrayList<Integer>[] tree = new ArrayList[n];
5        for(int i = 0; i <  n; i++){
6            tree[i] = new ArrayList<>();
7        }
8        for(int i = 1; i < n; i++){
9            tree[parent[i]].add(i);
10        }
11
12        int[] depth = new int[n];
13        Queue<Integer> q = new LinkedList<>();
14        depth[0] = 1;
15        q.add(0);
16
17        int height = 1;
18        while(!q.isEmpty()){
19            int node = q.poll();
20            for(int child : tree[node]){
21                depth[child] = depth[node] + 1;
22                height = Math.max(height, depth[child]);
23                q.add(child);
24            }
25        }
26
27        long sum = 0;
28        for(int i = 0; i < n; i++){
29            sum += (long) nums[i]*(height - depth[i]+1);
30        }
31        return sum;
32    }
33}