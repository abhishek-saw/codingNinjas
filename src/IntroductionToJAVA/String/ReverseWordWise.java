package IntroductionToJAVA.String;

public class ReverseWordWise {
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reverseWordWise(str));
    }
    private static String reverseWordWise(String input) {
        String answer = "";
        String word = "";
        for(int i =0;i<input.length();i++) {
            if (input.charAt(i) != ' ') {
                word =word+input.charAt(i);
            }
            else {
            answer = word+" "+answer;
            word = "";
            }
        }
        answer = word+" "+answer;
        return answer;
    }
}
