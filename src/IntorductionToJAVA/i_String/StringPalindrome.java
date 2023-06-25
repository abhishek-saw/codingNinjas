package IntorductionToJAVA.i_String;

public class StringPalindrome {
    public static void main(String[] args) {
        String str1 = "abcdcba";
        String str2 = "coding";
        boolean bol1 = isPalindrome(str1);
        boolean bol2 = isPalindrome(str2);
        System.out.println(bol1);
        System.out.println(bol2);
    }
    public static boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
