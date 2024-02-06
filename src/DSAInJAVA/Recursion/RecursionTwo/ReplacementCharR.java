package DSAInJAVA.Recursion.RecursionTwo;

public class ReplacementCharR {
    public static void main(String[] args) {
        String newChar = replaceChar("abxcxdxbxcxx",'x','y');
        System.out.println(newChar);
    }

    private static String replaceChar(String s, char c1, char c2) {
        if (s.isEmpty()) {
            return s;
        }
        String smallString = replaceChar(s.substring(1), c1, c2);
        if (s.charAt(0) == c1) {
            return c2 + smallString;
        }
        return s.charAt(0) + smallString;
    }
}
