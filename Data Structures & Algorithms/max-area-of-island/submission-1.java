class Solution {
    int[][] dir= new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0 ; i<grid.length ; i++){
            for (int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] ==1){
                   int count = bfs(grid,i,j);
                    max = Math.max(count,max);
                }
            }
        }
        return max;
    }
   public int bfs(int[][] grid, int i, int j){
    int count=1;
    grid[i][j]=0;
    Queue<int[]> q= new LinkedList<>();
    q.add(new int[]{i,j});

    while(!q.isEmpty()){
        int[] val= q.poll();
        int r= val[0], c=val[1];
        for(int[] d:dir){
            int nr=r+d[0], nc=c+d[1];
            if(nr >= 0 && nr < grid.length &&
             nc >= 0 && nc < grid[0].length && 
             grid[nr][nc]==1){
                q.add(new int[]{nr,nc});
                count++;
                grid[nr][nc]=0;
            }
        }

    }
    return count;

   }}

