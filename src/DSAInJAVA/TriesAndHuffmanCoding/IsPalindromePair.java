package DSAInJAVA.TriesAndHuffmanCoding;

import java.util.ArrayList;

public class IsPalindromePair {
    public static void main(String[] args) {
        ArrayList<String> vector = new ArrayList<>();
        vector.add("abc");
        vector.add("def");
        vector.add("ghi");
        vector.add("mmcba");
        System.out.println(isPalindromePair1(vector));
        Trie input = new Trie();
        System.out.println(input.isPalindromePairSelf(vector));
        System.out.println(input.isPalindromePair(vector));
    }

    private static boolean isPalindromePair1(ArrayList<String> vector) {
        Trie newNode = new Trie();
        for (String s : vector) {
            newNode.add(s);
//            System.out.println(s);
        }
        for (String s : vector) {
            String reverseString = reverseString(s);
//            System.out.println(reverseString);
            for(int i =0;i<reverseString.length();i++){
                if(newNode.search(reverseString.substring(i))){
                    return true;
                }
            }
            for(int i = reverseString.length()-1;i>=0;i--){
                if(newNode.search(reverseString.substring(0,i))){
                    return true;
                }
            }
        }
        return false;
    }
    private static String reverseString(String s) {
        if(s.isEmpty()){
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
