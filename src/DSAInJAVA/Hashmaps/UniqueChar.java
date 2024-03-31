package DSAInJAVA.Hashmaps;

import java.util.HashMap;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "abac";
        System.out.println(uniqueChar1(str));
        System.out.println(uniqueChar2(str));
    }
    private static String uniqueChar1(String str) {
        if(str.isEmpty()){
            return null;
        }
        HashMap<Character,Boolean> stringHashMap = new HashMap<>();
        String answer = "";
        for(int i=0;i<str.length();i++){
            if(!stringHashMap.containsKey(str.charAt(i))){
                stringHashMap.put(str.charAt(i),true);
                answer = answer.concat(String.valueOf(str.charAt(i)));
            }
        }
        return answer;
    }
    private static String uniqueChar2(String str) {
        HashMap<Character,Boolean> stringBooleanHashMap = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(!stringBooleanHashMap.containsKey(str.charAt(i))){
                stringBooleanHashMap.put(str.charAt(i),true);
                answer.append(str.charAt(i));
            }
        }
        return answer.toString();
    }
}
