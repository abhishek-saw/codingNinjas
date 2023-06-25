package IntorductionToJAVA.j_TwoDimensionalArray;

public class PrintMatrixInSpiral {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrixInSpiral(arr);
    }
    //four point for two col and two row
    //update after one row printing/one col printing
    //do for all
    private static void printMatrixInSpiral(int[][] arr) {
        int item = 0;
        int upperRow = 0;
        int lowerRow = arr.length - 1;
        int upperCol = 0;
        int lowerCol = arr[arr.length - 1].length - 1;

        while (item <= arr.length * arr[0].length-1) {
            //row upper
            int i = upperCol;
            while (i <= lowerCol) {
                System.out.print(arr[upperRow][i]);
                System.out.print(" ");
                item++;
                i++;
            }
            upperRow++;
            //col lower
            int j = upperRow;
            while (j <= lowerRow) {
                System.out.print(arr[j][lowerCol]);
                System.out.print(" ");
                item++;
                j++;
            }
            lowerCol--;
            //row lower
            int m = lowerCol;
            while (m >= upperCol) {
                System.out.print(arr[lowerRow][m]);
                System.out.print(" ");
                item++;
                m--;
            }
            lowerRow--;
            //col upper
            int n = lowerRow;
            while (n >= upperRow) {
                System.out.print(arr[n][upperCol]);
                System.out.print(" ");
                item++;
                n--;
            }
            upperCol++;

        }
    }
}

