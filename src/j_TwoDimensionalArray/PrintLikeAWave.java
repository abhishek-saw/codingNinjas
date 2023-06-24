package j_TwoDimensionalArray;

public class PrintLikeAWave {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 12}, {5, 6, 7, 13}, {9, 10, 11, 12}};
        printLikeAWave(arr);
    }

    private static void printLikeAWave(int[][] mat) {
        if(mat.length==0){
            System.out.println();
            return;
        }

        int upperCol = 0;
        int lowerCol = mat[mat.length-1].length-1;
        while(upperCol<=lowerCol){
            if(upperCol%2==0) {
                for(int i =0;i<mat.length;i++){
                    System.out.print(mat[i][upperCol]);
                    System.out.print(" ");
                }
            }
            else{
                for(int j = mat.length-1;j>=0;j--){
                    System.out.print(mat[j][upperCol]);
                    System.out.print(" ");
                }
            }
            upperCol++;
        }
    }
}
