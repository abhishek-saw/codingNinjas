package Revision.Recursions.RecursionTwo;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "abxcxdx";
        char org = 'x';
        char replace = 'y';
        String  ans = replaceCharacter(str,org,replace);
        System.out.println(ans);
    }
    private static String replaceCharacter(String input,char c1, char c2) {
        if (input.isEmpty()) {
            return input;
        }
        if (input.charAt(0) == c1) {
            return c2 + replaceCharacter(input.substring(1),c1, c2);
        }
        else{
            return input.charAt(0) + replaceCharacter(input.substring(1),c1, c2);
        }
    }
}

