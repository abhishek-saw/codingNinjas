package DSAInJAVA.TriesAndHuffmanCoding;

import java.util.ArrayList;

public class PatternMatching {
    public static void main(String[] args) {
        ArrayList<String> vector = new ArrayList<>();
        vector.add("abc");
        vector.add("def");
        vector.add("ghi");
        vector.add("cba");
        vector.add("hg");
        String pattern1 = "de";
        String pattern2 = "hi";
        String pattern3 = "hif";
        System.out.println(patternMatching(vector,pattern1));
        System.out.println(patternMatching(vector,pattern2));
        System.out.println(patternMatching(vector,pattern3));
        System.out.println("Inbuilt Type");
        Trie input = new Trie();
        System.out.println(input.patternMatching(vector,pattern1));
        System.out.println(input.patternMatching(vector,pattern2));
        System.out.println(input.patternMatching(vector,pattern3));
    }
    public static boolean patternMatching(ArrayList<String> vector, String pattern) {
        Trie newNode = new Trie();
        for (String s : vector) {
            for(int i = 0;i<s.length();i++){
                String smallString = s.substring(i);
                newNode.add(smallString);
            }
        }
        for (String s : vector) {
            for(int i = 1;i<s.length();i++){
                String smallString = s.substring(0,i);
                newNode.add(smallString);
            }
        }
        return newNode.search(pattern);
    }
}
