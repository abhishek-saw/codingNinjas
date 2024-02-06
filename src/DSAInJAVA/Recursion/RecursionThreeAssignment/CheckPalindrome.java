package DSAInJAVA.Recursion.RecursionThreeAssignment;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "abba";
        String s2 = "abbaa";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
    }

    private static boolean isPalindrome(String str) {
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        String smallStr = str.substring(1,str.length()-1);
        return isPalindrome(smallStr);
    }
}
