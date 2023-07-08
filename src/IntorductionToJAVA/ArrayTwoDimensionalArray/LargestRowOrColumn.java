package IntorductionToJAVA.ArrayTwoDimensionalArray;

public class LargestRowOrColumn {
    public static void main(String[] args) {
        int[][] arr2d={{1,2,3},{5,6,7},{9,10,11}};
        largestRowOrColumn(arr2d);
        int[][] arr2dd={{6,9},{8,5},{9,2}};
        largestRowOrColumn(arr2dd);
        int[][] arr2ddd= new int[0][0];
        largestRowOrColumn(arr2ddd);
    }
    private static void largestRowOrColumn(int[][] arr2d) {
        int rowSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        if(arr2d.length==0){
            System.out.println("row "+rowIndex+" "+""+rowSum );
            return;
        }
        for (int i = 0; i < arr2d.length; i++) {
            int tempSum=0;
            for (int j = 0; j < arr2d[0].length; j++) {
                tempSum+=arr2d[i][j];
            }
            if(rowSum<tempSum){
                rowSum = tempSum;
                rowIndex = i;
            }
        }
        int colSum = Integer.MIN_VALUE;
        int colIndex = 0;
        for (int i = 0; i < arr2d[0].length; i++) {
            int tempSum=0;
            for (int j=0; j < arr2d.length; j++) {
                tempSum+=arr2d[j][i];
            }
            if(colSum<tempSum){
                colSum = tempSum;
                colIndex = i;
            }
        }

        if(rowSum>colSum){
            System.out.println("row "+rowIndex+" "+""+rowSum );
        }
        else{
            System.out.println("column "+colIndex+" "+""+colSum );
        }
    }
}
