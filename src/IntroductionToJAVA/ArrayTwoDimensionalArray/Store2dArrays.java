package IntroductionToJAVA.ArrayTwoDimensionalArray;
public class Store2dArrays {
    public static void main(String args[]) {
        int[]arr={1,2,3,4};
        System.out.println("1D array : "+ arr.length);
        int[][] arr2d={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(arr2d);
        System.out.println(arr2d[0]);
        System.out.println(arr2d[1]);
        System.out.print("row : ");
        System.out.println(arr2d.length);
        System.out.print("col : ");
        System.out.println(arr2d[0].length);
    }
}