package DSAInJAVA.TriesAndHuffmanCoding;

import java.util.ArrayList;

public class AutoComplete {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("do");
        input.add("dont");
        input.add("no");
        input.add("not");
        input.add("note");
        input.add("notes");
        input.add("now");
        input.add("den");
        String pattern = "no";
        Trie newNode = new Trie();
        newNode.autoComplete(input,pattern);
        for (String string : input) {
            newNode.add(string);
        }
        System.out.println("Self");
        newNode.autoCompleteSelf(pattern);
    }
}
