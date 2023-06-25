package IntorductionToJAVA.i_String;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        String s1 = "abc";
        printAllSubstrings1(s1);
        printAllSubstrings2(s1);
        String s2 = "PQRS";
        printAllSubstrings1(s2);
        printAllSubstrings2(s2);
    }
    private static void printAllSubstrings1(String s) {
        for(int i=0;i<s.length();i++) {// think substrings as pattern
            for (int j = i; j < s.length(); j++){ //We will be printing all substrings starting with char at index start
                System.out.println(s.substring(i,j+1));
            }
        }
    }
    private static void printAllSubstrings2(String s) {
        for(int i=0;i<s.length();i++) { //We have to print all strings wih length as "len"
            for (int j = 0; j < s.length()-i; j++) {//remember
                System.out.println(s.substring(j, i+j+1));
            }
        }
    }
}
