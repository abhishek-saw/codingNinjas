package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

import java.util.Arrays;
import java.util.Objects;

public class LongestCommonSubsequenceRecursion1 {
    public static void main(String[] args) {
        String s1 = "adebc";
        String s2 = "dcadb";
        System.out.println(lcs(s1,s2));
    }

    private static int lcs(String s1, String s2) {
        String[] sub1 = subsequences(s1);
        System.out.println(Arrays.toString(sub1));
        String[] sub2 = subsequences(s2);
        System.out.println(Arrays.toString(sub2));
        int len =0;
        String ans = "";
        for (String string1 : sub1) {
            for (String string2 : sub2) {
                if (Objects.equals(string1, string2) && string1.length() > len) {
                    len = string1.length();
                    ans = string1;
                    break;
                }
            }
        }
        return ans.length();
    }
    private static String[] subsequences(String s) {
        if(s.isEmpty()){
            return new String[]{""};
        }
        char chars = s.charAt(0);
        String[] strings = subsequences(s.substring(1));
        String[] answer = new String[2*strings.length];
        System.arraycopy(strings, 0, answer, 0, strings.length);
        for(int i =strings.length;i<answer.length;i++){
            answer[i] = chars + strings[i-strings.length];
        }
        return answer;
    }
}
