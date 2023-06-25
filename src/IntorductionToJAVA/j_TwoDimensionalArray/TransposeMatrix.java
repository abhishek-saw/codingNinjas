package IntorductionToJAVA.j_TwoDimensionalArray;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr2d={{1,2},{5,6},{9,0}};
        int[][] result = transposeMatrix(arr2d);
        TakeInputAndPrint2DArray.print2DArray(arr2d);
        System.out.println();;
        TakeInputAndPrint2DArray.print2DArray(result);


    }
    private static int[][] transposeMatrix(int[][] mat) {
        int[][] result = new int [mat[0].length][mat.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = mat[j][i];
            }
        }
        return result;
    }
}
