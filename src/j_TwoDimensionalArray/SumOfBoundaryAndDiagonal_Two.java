package j_TwoDimensionalArray;

public class SumOfBoundaryAndDiagonal_Two {
    public static void main(String[] args) {
        int[][] arr2d = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr2dd = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        int[][] arr2ddd = {{1, 2}, {3, 4}};

        TakeInputAndPrint2DArray.print2DArray(arr2d);
        totalSum(arr2d);
        TakeInputAndPrint2DArray.print2DArray(arr2dd);
        totalSum(arr2dd);
        TakeInputAndPrint2DArray.print2DArray(arr2ddd);
        totalSum(arr2ddd);
    }

    public static void totalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[0][i];
            sum += mat[mat.length - 1][i];
        }
        for (int i = 1; i < mat.length-1; i++) {
            sum += mat[i][0];
            sum += mat[i][mat.length-1];
        }
        for (int i = 1; i < mat.length-1; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }
        if(mat.length%2!=0){
            sum = sum - mat[mat.length/2][mat.length/2];
        }
        System.out.println(sum);
    }
}