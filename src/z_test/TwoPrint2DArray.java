package z_test;

public class TwoPrint2DArray {
    public static void main(String[] args) {
        int[][] arr2d={{1,2,3},{5,6,7},{9,10,11}};
        twoPrint2DArray(arr2d);
    }
    private static void twoPrint2DArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int k = input.length-i; k > 0; k--) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
