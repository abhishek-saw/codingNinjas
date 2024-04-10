package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class StaircaseRecursion {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(staircase(n));
    }

    private static long staircase(int n) {
        if(n==0 ){
            return 1;
        }
        if(n==1 ){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return staircase(n-1) + staircase(n-2) + staircase(n-3);
    }
}
