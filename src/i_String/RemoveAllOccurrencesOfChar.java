package i_String;

public class RemoveAllOccurrencesOfChar {
    public static void main(String[] args) {
        String str = "aabccbaa";
        char ch = 'a';
        System.out.println(removeAllOccurrencesOfChar(str,ch));
    }

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String answer = "";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                answer=answer+str.charAt(i);
            }
        }
        return answer;
    }
}
