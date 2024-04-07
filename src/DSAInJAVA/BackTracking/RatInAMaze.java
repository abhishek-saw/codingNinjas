package DSAInJAVA.BackTracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int [][] maze = {{1,1,0},{1,1,0},{1,1,1}};
        System.out.println("RatInAMaze");
        print(maze);
        System.out.println("Path Possible: " + ratInAMaze(maze));
    }
    public static boolean ratInAMaze(int[][] maze){
        int [][] path = new int[maze.length][maze[0].length];
        return ratInAMazeHelper(maze,0,0,path);
    }
    private static boolean ratInAMazeHelper(int[][] maze, int i, int j, int[][] path) {
        //check if i,j cell is valid or not
        if(i<0 || i >= maze.length || j<0 || j>=maze[0].length || maze[i][j] ==0 || path[i][j] ==1) {
            return false;
        }
        path[i][j] = 1;
        //Include the cell in current path
        if(i==maze.length-1 && j==maze[0].length-1 ){
            System.out.println("PathInAMaze");
            print(path);
            return false;
        }
        //Explore further in all directions
        //Top
        if(ratInAMazeHelper(maze,i-1,j,path)){
            return true;
        }
        //Right
        if(ratInAMazeHelper(maze,i,j+1,path)){
            return true;
        }
        //Down
        if(ratInAMazeHelper(maze,i+1,j,path)){
            return true;
        }
        //Left
        if(ratInAMazeHelper(maze,i,j-1,path)){
            return true;
        }
        return false;
    }
    private static void print(int[][] array) {
        for (int[] ins : array) {
            for (int c = 0; c < array[0].length; c++) {
                System.out.print(ins[c] + " ");
            }
            System.out.println();
        }
    }
}
