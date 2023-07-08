package IntorductionToJAVA.String;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reverseEachWord(str));
    }

    private static String reverseEachWord(String str) {
        String answer = "";
        String word = "";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word = str.charAt(i)+word;
            }
            else{
                answer = answer+word+" ";
                word = "";
            }
        }
        answer = answer+word;
        return answer;
    }
}
