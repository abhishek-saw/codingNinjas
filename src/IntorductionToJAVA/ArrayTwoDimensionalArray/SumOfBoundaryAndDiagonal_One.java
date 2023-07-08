package IntorductionToJAVA.ArrayTwoDimensionalArray;

public class SumOfBoundaryAndDiagonal_One {
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
        int sum =0;
        int sumBoundary = 0;
        for(int i=0;i<mat.length;i++){
            if(i==0 || i== mat.length-1){
                for(int j=0;j<mat[0].length;j++) {
                    sumBoundary += mat[i][j];
                }
            }
            else{
                sumBoundary+=mat[i][0];
                sumBoundary+=mat[i][mat.length-1];
            }
        }
        System.out.println(sumBoundary);
        int sumDiagonal =0;
        for(int i=1;i<mat.length-1;i++) {
            for (int j = 1; j < mat[0].length-1; j++) {
                if (i == j) {
                    sumDiagonal += mat[i][j];
                }
                if(i+j==mat.length-1){
                    sumDiagonal += mat[i][j];
                }
            }
        }
        System.out.println(sumDiagonal);
        if(mat.length%2!=0){
            sum = sumBoundary + sumDiagonal - mat[mat.length/2][mat.length/2];
        }
        else {
            sum = sumBoundary + sumDiagonal;
        }
        System.out.println(sum);
    }
}