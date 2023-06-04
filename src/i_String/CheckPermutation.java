package i_String;

public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(checkPermutation(str1,str2));
        String str3 = "race";
        String str4 = "rame";
        System.out.println(checkPermutation(str3,str4));
    }
    private static boolean checkPermutation(String str1, String str2) {
        boolean ans = false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    ans = true;
                    break;
                }
                else{
                    ans = false;
                }
            }
            if(!ans) {
                break;
            }
        }
        return ans;
    }
}
