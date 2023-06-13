package j_TwoDimensionalArray;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] arr2d = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} };
        rowWiseSum(arr2d);
}

    private static void rowWiseSum(int[][] arr2d) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[0].length; j++) {
                sum += arr2d[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
