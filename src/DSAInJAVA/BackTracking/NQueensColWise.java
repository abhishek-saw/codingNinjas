package DSAInJAVA.BackTracking;

public class NQueensColWise {
    public static void main(String[] args) {
        // This algorithm works in such a way that first we start from row 0 and then go to row n,
        // Here, we already start from column zero. We can also not start from column 0
        // Now, first we check if that isSafe so that we can add the queen if now, we can then we will move to next column,
        // and we check the same for the next column. This ritual or the recursion goes on till, we reach to the last column
        // now is safe check if there is no queen present in rose in the
        // same rose in the same column and in diagonally in every way
        int n = 4;
        placeNQueens(n);
    }
    private static void placeNQueens(int n) {
        int[][] board = new int[n][n];
        placeNQueensHelper(board, 0);
    }
    private static boolean placeNQueensHelper(int[][] board, int col) {
        if (col == board.length) {
            print1(board);
            print2(board);
            System.out.println();
            return true;
        }
        boolean placed = false;
        for (int i = 0; i < board.length; i++) { //going row wise
            if (isSafe(board, i, col)) { //checking for any attack
                board[i][col] = 1;
                placed = placeNQueensHelper(board, col + 1) || placed;
                board[i][col] = 0;
            }
        }
        return placed;
    }
    private static boolean isSafe(int[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < board.length; i++) { //check row
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (i = 0; i < board.length; i++) { // check col
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) { //diagonal up to down - all point in diagonal - i--
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i < board.length && j >= 0; i++, j--) { //diagonal down to up - only from curr col to zero col - i++
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }
    private static void print1(int[][] board) {
        for (int[] ins : board) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(ins[c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void print2(int[][] board) {
        for (int[] ins : board) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(ins[c] + " ");
            }
        }
        System.out.println();
    }
}
