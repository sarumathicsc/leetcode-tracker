// Last updated: 7/9/2026, 7:40:03 AM
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<int[]>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] e : edges){
            graph[e[0]].add(new int[] {e[1],e[2]});
        }

        int[][] dist = new int[n][k+1];
        for(int[] row : dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        PriorityQueue<State> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.cost, b.cost));
        dist[0][1] = 0;
        pq.offer(new State(0,0,1));

        while(!pq.isEmpty()){
            State cur = pq.poll();

            int u = cur.node;
            int cost = cur.cost;
            int cnt = cur.cnt;

            if(u == n-1) return cost;

            if(cost > dist[u][cnt]) continue;
            for(int[] next : graph[u]){
                int v = next[0];
                int w = next[1];
                int newcnt;
                if(labels.charAt(v) == labels.charAt(u)) newcnt = cnt +1;
                else newcnt = 1;

                if(newcnt > k) continue;
                int newcost = cost+w;
                if(newcost < dist[v][newcnt]){
                    dist[v][newcnt] = newcost;
                    pq.offer(new State(v,newcost,newcnt));
                }
            }
        }
        return -1; 
    }
    static class State{
        int node;
        int cost;
        int cnt;

        State(int node, int cost, int cnt){
            this.node = node;
            this.cost = cost;
            this.cnt = cnt;
        }
    }
}