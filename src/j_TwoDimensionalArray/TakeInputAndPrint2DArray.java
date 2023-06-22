package j_TwoDimensionalArray;
import java.util.Scanner;
public class TakeInputAndPrint2DArray {
    public static void main(String[] args) {
        int arr2D[][] = takeInput2DArray();
        print2DArray(arr2D);
    }
    public static int[][] takeInput2DArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = s.nextInt();
        System.out.println("Enter the number of column: ");
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter the number in " + i + "th row and " + j + "th column ");
                int element = s.nextInt();
                arr[i][j] = element;
            }
        }
        return arr;
    }
    public static void print2DArray(int[][] arr2D) {
        for(int i =0;i< arr2D.length;i++){
            for(int j =0;j< arr2D[i].length;j++){
                System.out.print(arr2D[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
