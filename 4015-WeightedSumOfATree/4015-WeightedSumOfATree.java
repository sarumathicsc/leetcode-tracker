// Last updated: 10/9/2026, 9:32:24 AM
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        ArrayList<Integer>[] tree = new ArrayList[n];
        for(int i = 0; i <  n; i++){
            tree[i] = new ArrayList<>();
        }
        for(int i = 1; i < n; i++){
            tree[parent[i]].add(i);
        }

        int[] depth = new int[n];
        Queue<Integer> q = new LinkedList<>();
        depth[0] = 1;
        q.add(0);

        int height = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int child : tree[node]){
                depth[child] = depth[node] + 1;
                height = Math.max(height, depth[child]);
                q.add(child);
            }
        }

        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += (long) nums[i]*(height - depth[i]+1);
        }
        return sum;
    }
}