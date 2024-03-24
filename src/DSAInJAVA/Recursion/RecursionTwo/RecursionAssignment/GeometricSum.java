package DSAInJAVA.Recursion.RecursionTwo.RecursionAssignment;

public class GeometricSum {
    public static void main(String[] args) {
        int k = 3;
        System.out.println(findGeometricSum(k));
    }

    private static double findGeometricSum(int k) {
        if(k==0){
            return 1;
        }
        return  Math.pow(0.5,k) + findGeometricSum(k-1);
    }
}
