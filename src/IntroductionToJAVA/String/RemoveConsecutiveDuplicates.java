package IntroductionToJAVA.String;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str1 = "aaaaaa";
        System.out.println(removeConsecutiveDuplicates(str1));
        String str2 = "aaabbccdsa";
        System.out.println(removeConsecutiveDuplicates(str2));
    }
    private static String removeConsecutiveDuplicates(String str) {
        String answer = "";
        int index = 0;
        answer = answer+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(answer.charAt(index)!=str.charAt(i)){
                answer = answer+str.charAt(i);
                index++;
            }
        }
        return answer;
    }
}