package i_String;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str1 = "aaaa";
        System.out.println(removeConsecutiveDuplicates(str1));
        String str2 = "aaaabbbbcccc";
        System.out.println(removeConsecutiveDuplicates(str2));
    }
    private static String removeConsecutiveDuplicates(String str) {
        String ans = "";
        for(int i =0;i<str.length();i++){
            ans = ans + str.charAt(i);
        }
        return ans;
    }
}
