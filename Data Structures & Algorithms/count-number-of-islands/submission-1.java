class Solution {
    int[][] dir= new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int island=0;
        for(int i=0 ; i<grid.length ; i++){
            for (int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] =='1'){
                    bfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }
   public void bfs(char[][] grid, int i, int j){
    grid[i][j]='0';
    Queue<int[]> q= new LinkedList<>();
    q.add(new int[]{i,j});

    while(!q.isEmpty()){
        int[] val= q.poll();
        int r= val[0], c=val[1];
        for(int[] d:dir){
            int nr=r+d[0], nc=c+d[1];
            if(nr >= 0 && nr < grid.length &&
             nc >= 0 && nc < grid[0].length && 
             grid[nr][nc]=='1'){
                q.add(new int[]{nr,nc});
                grid[nr][nc]='0';
            }
        }

    }


    }
}
