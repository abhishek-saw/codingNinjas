package f_SearchAndSorting;

public class SmallestDifferencePair {
    public static void main(String[] args) {
        int [] arr1 = {1,5,12,3};
        int [] arr2 = {16,9,10,20};
        int [] arr3 = {20,10};
        int [] arr4 = {10,13,19,16};
        int answer1 = smallestDifferencePair(arr1, arr1.length, arr2, arr2.length);
        System.out.println(answer1);
        int answer2 = smallestDifferencePair(arr3, arr3.length, arr4, arr4.length);
        System.out.println(answer2);

    }
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int diff ;
                diff = arr1[i] - arr2[j];
                if(diff<0){
                    diff = -1*diff;
                }
                if(small>diff){
                    small = diff;
                }
            }
        }
        return small;
    }
}
