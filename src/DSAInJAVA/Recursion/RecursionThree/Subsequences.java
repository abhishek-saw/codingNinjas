package DSAInJAVA.Recursion.RecursionThree;

import java.util.Arrays;

public class Subsequences {
    public static void main(String[] args) {
        String string = "coal";
        String [] ans = subsequences(string);
        System.out.println(Arrays.toString(ans));
        System.out.println(ans.length);
    }
    private static String[] subsequences(String string) {
        if (string.isEmpty()) { // base case
            return new String[]{""}; //empty string
        }
        char character = string.charAt(0); // 0th index char
        String [] smallOutput = subsequences(string.substring(1)); //recursion call for n-1
        String [] answer = new String[2*smallOutput.length]; // 2 options :  take it leave it hence double size
        System.arraycopy(smallOutput, 0, answer, 0, smallOutput.length); // first leave it same as same so copy
        for(int i = smallOutput.length;i<answer.length;i++){ // appending the 0th index char
            answer[i] = character + smallOutput[i-smallOutput.length] ;
        }
        return answer;
    }
}
