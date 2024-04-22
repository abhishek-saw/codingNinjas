package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;


public class LongestCommonSubsequenceRecursion3 {
    public static void main(String[] args) {
        String s1 = "adebc";
        String s2 = "dcadb";
        System.out.println(lcs(s1, s2));
    }

    private static int lcs(String s1, String s2){
        if(s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }
        if(s1.charAt(0) == s2.charAt(0)){
            return   1 + lcs(s1.substring(1),s2.substring(1));
        }
        else {
            int a = lcs(s1.substring(1),s2);
            int b = lcs(s1,s2.substring(1));
            int c = lcs(s1.substring(1),s2.substring(1));
            return Math.max(a,Math.max(b,c));
        }
    }
}