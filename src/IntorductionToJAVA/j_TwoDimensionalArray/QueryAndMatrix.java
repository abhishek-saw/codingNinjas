package IntorductionToJAVA.j_TwoDimensionalArray;

import IntorductionToJAVA.e_ArrayOne.TakeInputAndPrint;

public class QueryAndMatrix {
    public static void main(String[] args) {
        int[][] arr2d={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        String q []= {"1R1","1R2","1R0","1R3","1C1","2R1","2C2","1C2","2R2","2C1"};

        int[]result =query(arr2d,arr2d.length,arr2d[0].length,q);
        TakeInputAndPrint.printArray(result);
        System.out.println();
        System.out.println();
        TakeInputAndPrint2DArray.print2DArray(arr2d);
    }
    public static int[] query(int[][] mat, int m, int n, String[] q) {
        int index = 0;
        int len = 0;
        for(int i =0; i<q.length;i++) {
            if((int)q[i].charAt(0)=='2'){
                len++;
            }
        }
        int answer [] = new int[len];

        for(int i =0; i<q.length;i++){
            if((int)q[i].charAt(0)=='1'){
                if(q[i].charAt(1)=='R'){
                    for(int p =0;p< mat.length;p++){
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if(mat[indexChange][p]==0) {
                            mat[indexChange][p] = 1;
                        }else{
                            mat[indexChange][p] = 0;
                        }
                    }
                }
                else {
                    for(int p =0;p< mat[0].length;p++){
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if(mat[p][indexChange]==0) {
                            mat[p][indexChange] = 1;
                        }
                        else{
                            mat[p][indexChange]=0;
                        }
                    }
                }
            }
            else{
                int count = 0;
                if(q[i].charAt(1)=='R') {
                    for (int p = 0; p < mat.length; p++) {
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if (mat[indexChange][p] == 0) {
                            count++;
                        }
                    }
                }
                else{
                    for (int p = 0; p < mat.length; p++) {
                        int indexChange = Integer.parseInt(String.valueOf(q[i].charAt(2)));
                        if (mat[p][indexChange] == 0) {
                            count++;
                        }
                    }
                }
                answer[index] = count;
                index++;

            }
        }
        return answer;
    }
}
