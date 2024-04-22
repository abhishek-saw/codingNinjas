package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;


public class LongestCommonSubsequenceRecursion2 {
    public static void main(String[] args) {
        String s1 = "adebc";
        String s2 = "dcadb";
        System.out.println(lcs(s1, s2));
    }

    private static int lcs(String s1, String s2) {
        return lcsHelper(s1,s2,0,0);
    }

    private static int lcsHelper(String s1, String s2, int i, int j) {
        if(i==s1.length() || j==s2.length()) {
            return 0;
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return   1 + lcsHelper(s1,s2,i+1,j+1);
        }
        else {
            return Math.max(lcsHelper(s1,s2,i+1,j),lcsHelper(s1,s2,i,j+1));
        }
    }
}