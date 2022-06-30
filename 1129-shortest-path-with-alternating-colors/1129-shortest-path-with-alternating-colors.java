class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] res = new int[n];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0] = 0;
        
        boolean[][] visited = new boolean[n][2];
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> color = new LinkedList<Integer>();
        Queue<Integer> length = new LinkedList<Integer>();
        for(int i = 0; i < redEdges.length; i++){
            int from = redEdges[i][0];
            int to = redEdges[i][1];
            if(from == 0){
                q.add(to);
                color.add(0);
                length.add(1);
            }
        }
        for(int i = 0; i < blueEdges.length; i++){
            int from = blueEdges[i][0];
            int to = blueEdges[i][1];
            if(from == 0){
                q.add(to);
                color.add(1);
                length.add(1);
            }
        }
        while(!q.isEmpty()){
            int node = q.remove();
            int c = color.remove();
            int len = length.remove();
            if(visited[node][c]){
                continue;
            }
            visited[node][c] = true;
            res[node] = Math.min(res[node], len);
            
            if(c == 1){
            for(int i = 0; i < redEdges.length; i++){
            int from = redEdges[i][0];
            int to = redEdges[i][1];
            if(from == node){
                q.add(to);
                color.add(0);
                length.add(len+1);
            }
            }
        }
            if(c == 0){
        for(int i = 0; i < blueEdges.length; i++){
            int from = blueEdges[i][0];
            int to = blueEdges[i][1];
            if(from == node){
                q.add(to);
                color.add(1);
                length.add(len+1);
            }
        }
            }
        }
        for(int i = 0; i < res.length; i++){
            if(res[i] == Integer.MAX_VALUE){
                res[i] = -1;
            }
        }
        return res;
    }
    
}