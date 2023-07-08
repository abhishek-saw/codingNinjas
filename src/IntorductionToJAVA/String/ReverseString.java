package IntorductionToJAVA.String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reverseString1(str));
        System.out.println(reverseString2(str));
    }
    private static String reverseString1(String str) {
        String reverseString = "";
        for(int i =str.length()-1;i>=0;i--){
            reverseString +=(str.charAt(i));
        }
        return reverseString;
    }
    private static String reverseString2(String str) {
        String reverseString = "";
        for(int i =0;i<str.length();i++){
            reverseString  = str.charAt(i) +reverseString ;
            System.out.println(reverseString);
        }
        return reverseString;
    }
}
