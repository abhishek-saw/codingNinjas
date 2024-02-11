package Revision.TimeComplexity;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] findD = {0,7,2,5,4,7,1,3,6};
        System.out.println(findDuplicate(findD));
    }
    public static int findDuplicate(int[] arr) {
        int allSum = 0;
        int numSum = 0;
        for(int i =0;i<arr.length;i++){
            allSum+=arr[i];
        }
        for(int j=0;j<arr.length-1;j++){
            numSum+=j;
        }
        return allSum-numSum;
    }
}
