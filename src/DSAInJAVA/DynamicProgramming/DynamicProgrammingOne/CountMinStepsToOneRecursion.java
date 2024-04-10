package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class CountMinStepsToOneRecursion {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countMinStepsToOne(n));
    }

    private static int countMinStepsToOne(int n) {
        if(n<=1){
            return 0;
        }
        int a  = countMinStepsToOne(n-1);
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        if(n%2==0){
            b =  countMinStepsToOne(n/2);
        }
        if(n%3==0){
            c =  countMinStepsToOne(n/3);
        }
        return 1 + Math.min(a,Math.min(b,c));
    }
}
