package IntorductionToJAVA.ArrayTwoDimensionalArray;

public class SquareMatrix {
    public static void main(String[] args) {
        int[][] arr2dA = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        int[] diag = new int[arr2dA.length];
        String ans = sqrMat(arr2dA, arr2dA.length, arr2dA[0].length,diag);
        System.out.println(ans);
        if (ans.equals("YES")) {
            for (int i = 0; i < diag.length; i++) {
                System.out.print(diag[i] + " ");
            }
            System.out.println();
        }
    }
    public static String sqrMat(int [][]mat, int n, int m,int diag[]) {
        String answer = "";
        if (n != m) {
            answer = "NO";

        }
        else {
            answer = "YES";
            for(int i=0;i<n;i++){
                diag[i] = mat[i][i];
            }
        }
        return answer;
    }
}
