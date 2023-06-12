package j_TwoDimensionalArray;
import java.util.Scanner;
public class TakeInputAndPrint2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = s.nextInt();
        System.out.println("Enter the number of column: ");
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the number in " + i + "th row and " + j + "th column ");
                int element = s.nextInt();
                arr[i][j] = element;
            }
        }
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
