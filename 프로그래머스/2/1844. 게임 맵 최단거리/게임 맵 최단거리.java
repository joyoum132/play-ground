import java.util.*;

class Solution {
 public int solution(int[][] maps) {
        int enemyN = maps.length;
        int enemyM = maps[0].length;
        int[][] visited = new int[enemyN][enemyM];

        findShortest(maps, visited, 0,0);

        return visited[enemyN-1][enemyM-1] == 0 ? -1 : visited[enemyN-1][enemyM-1];
    }

    private void findShortest(int[][] maps, int[][] visited, int n, int m) {
        int[][] direction = {{0,1}, {0,-1}, {1,0}, {-1,0}}; //동서남북
        visited[n][m] = 1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{n,m});

        while(!q.isEmpty()) {
            int[] current = q.poll();
            for(int i=0;i<4;i++) {
                int nextN = current[0] + direction[i][0];
                int nextM = current[1] + direction[i][1];

                if(nextN < 0 || nextN >= maps.length
                        || nextM <0 || nextM >= maps[0].length
                        || visited[nextN][nextM] != 0
                        || maps[nextN][nextM] == 0) {
                    continue;
                }
                visited[nextN][nextM] = visited[current[0]][current[1]]+1;
                q.add(new int[] {nextN, nextM});
            }
        }
    }
}