import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MazeII {
    public int find(int[][] maze, int[] start, int[] des) {
        int[][] distance = new int[maze.length][maze[0].length];
        for(int[] row: distance)
            Arrays.fill(row,Integer.MAX_VALUE);
        Queue<int[]> queue = new LinkedList<>();
        distance[start[0]][start[1]] = 0;
        queue.add(start);
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] s = queue.remove();
            for (int[] dir : dirs) {
                int x = s[0] + dir[0];
                int y = s[1] + dir[1];
                int count = 0;
                while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
                    x += dir[0];
                    y += dir[1];
                    count++;
                }

                if (distance[s[0]][s[1]]+count<distance[x-dir[0]][y-dir[1]]){
                    distance[x-dir[0]][y-dir[1]] = distance[s[0]][s[1]] + count;
                    queue.add(new int[]{x-dir[0],y-dir[1]});
                }
            }
        }
        return distance[des[0]][des[1]] == Integer.MAX_VALUE? -1 : distance[des[0]][des[1]];
    }

    public static void main(String[] args){
        MazeII m =new MazeII();
        int[][] maze = {{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{1,1,0,1,1},{0,0,0,0,0}};
        int[] start = {0,4};
        int[] destination = {4,4};
        int dis  = m.find(maze,start,destination);
        System.out.println(dis);
    }
}
