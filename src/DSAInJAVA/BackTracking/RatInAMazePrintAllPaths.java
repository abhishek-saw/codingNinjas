package DSAInJAVA.BackTracking;

public class RatInAMazePrintAllPaths {
    public static void main(String[] args) {
        int [][] maze = {{1,1,0},{1,1,0},{1,1,1}};
        System.out.println("RatInAMaze");
        printMaze(maze);
        System.out.println("Maze");
        print(maze);
        System.out.println("AllPathsInRatInAMaze");
        printRatInAMaze(maze,maze.length);
    }
    public static void printRatInAMaze(int[][] maze,int n){
        int [][] path = new int[n][n];
        printAllPaths(maze,0,0, path, n);
    }
    private static void printAllPaths(int[][] maze, int i, int j, int[][] path,int n) {
        if (i < 0 || i >=n|| j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return ;
        }
        path[i][j] = 1;
        if (i == n - 1 && j == n - 1) {
            print(path);
            path[i][j] = 0;
            return;
        }
        printAllPaths(maze, i - 1, j, path,n); //Top
        printAllPaths(maze, i + 1, j, path,n); //Down
        printAllPaths(maze, i, j + 1, path,n); //Right
        printAllPaths(maze, i, j - 1, path,n); //Left
        path[i][j] = 0;
    }
    private static void print(int[][] array) {
        for (int[] ins : array) {
            for (int c = 0; c < array[0].length; c++) {
                System.out.print(ins[c] + " ");
            }
        }
        System.out.println();
    }
    private static void printMaze(int[][] array) {
        for (int[] ins : array) {
            for (int c = 0; c < array[0].length; c++) {
                System.out.print(ins[c] + " ");
            }
            System.out.println();
        }
    }
}
