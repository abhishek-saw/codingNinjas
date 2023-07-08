package IntorductionToJAVA.String;

public class CompressedString {
    public static void main(String[] args) {
        String str = "aaabbccdsa";
        System.out.println(compressedString(str));
        String str1 = "aabbb";
        System.out.println(compressedString(str1));
    }

    private static String compressedString(String str) {
        String answer = "";
        int index = 0;
        int count = 1;
        answer = answer+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(answer.charAt(index)!=str.charAt(i)){
                if(count==1) {
                    answer = answer + str.charAt(i);
                    index += 1;
                    count = 1;
                }
                else{
                    answer = answer + count + str.charAt(i);
                    index += 2;
                    count = 1;
                }
            }
            else{
                count++;
            }
        }
        if(count!=1) {
            answer = answer + count;
        }
        return answer;
    }
}
