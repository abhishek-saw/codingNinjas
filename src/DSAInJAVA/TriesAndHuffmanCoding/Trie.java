package DSAInJAVA.TriesAndHuffmanCoding;

import java.util.ArrayList;
import java.util.Objects;

public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode('\0'); // this is kinda of root which have the next 26 element
    }

    public void add(String word) {
        addHelper(root, word);
        root.childCount++;
    }

    private void addHelper(TrieNode root, String word) {
        if (word.isEmpty()) {
            root.isTerminal = true;
            root.childCount--;
            return;
        }
        int childIndex = word.charAt(0) - 'a'; // 'd' - 'a' = location of a in 0,1,2,3,....
        TrieNode child = root.children[childIndex]; // to find that if anything already present there or not;
        if (child == null) { // if it's not present we have to add that in that particular root at that position
            child = new TrieNode(word.charAt(0)); //creating the child index for the word
            root.children[childIndex] = child;//adding that the child index we have calculated above
        }
        addHelper(child, word.substring(1)); // then we go more down to add the next char for the word string
    }

    public boolean search(String word) {
        return searchHelper(root, word);
    }

    private boolean searchHelper(TrieNode root, String word) {
        if (word.isEmpty()) {
            return root.isTerminal;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child != null) {
            return searchHelper(child, word.substring(1));
        } else {
            return false;
        }
    }

    public void remove(String word) {
        removeHelper(root, word);
    }

    private void removeHelper(TrieNode root, String word) {
        if (word.isEmpty()) {
            if (root.isTerminal) {
                root.isTerminal = false;
                return;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return;
        }
        removeHelper(child, word.substring(1));
        if (!child.isTerminal && child.childCount == 0) {
            root.children[childIndex] = null;
            root.childCount--;
        }
/*
        OR
        if(!child.isTerminal){
            for (int i=0;i<25;i++){
                if(child.children[i]!=null){
                    return;
                }
                else {
                    root.children[i] = null;
                }
            }
        }
*/
    }

    public int countWords() {
        return root.childCount;
    }

    //    My version of without child Count
//    public int countWords() {
//        return countWordsHelper(root);
//    }
//    private int countWordsHelper(TrieNode root) {
//        if(root==null){
//            return 0;
//        }
//        int totalCount = 0;
//        if(root.isTerminal) {
//             totalCount = 1;
//        }
//        for(int i =0; i<26;i++){
//            int smallSum = countWordsHelper(root.children[i]);
//            totalCount+=smallSum;
//        }
//        return totalCount;
//    }
//    patternMatching
    public boolean patternMatching(ArrayList<String> vector, String pattern) {
        for (String word : vector) {
            for (int j = 0; j < word.length(); j++) {
                System.out.println(word.substring(j));
                add(word.substring(j));
            }
        }
        return search(pattern);
    }

    //    isPalindromePairSelf
    public boolean isPalindromePairSelf(ArrayList<String> vector) {
        Trie newNode = new Trie();
        for (String s : vector) {
            newNode.add(s);
//            System.out.println(s);
        }
        for (String s : vector) {
            String reverseString = reverseString(s);
//            System.out.println(reverseString);
            for (int i = 0; i < reverseString.length(); i++) {
                if (newNode.search(reverseString.substring(i))) {
                    return true;
                }
            }
            for (int i = reverseString.length() - 1; i >= 0; i--) {
                if (newNode.search(reverseString.substring(0, i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String reverseString(String string) {
        if (string.isEmpty()) {
            return "";
        }
        return reverseString(string.substring(1)) + string.charAt(0);
    }

    //    isPalindromePair
    public boolean isPalindromePair(ArrayList<String> words) {
        for (String string : words) {
            add(reverseString(string));
        }
        return isPalindromePairHelper(root, words);
    }

    private boolean isPalindromePairHelper(TrieNode root, ArrayList<String> words) {
        if (words.isEmpty()) {
            return false;
        }
        for (String word : words) {
            if (isDoesPairExist(root, word, 0)) {
                return true;
            }
        }
        return true;
    }

    private boolean isDoesPairExist(TrieNode root, String word, int startIndex) {
        if (Objects.equals(word, "")) {
            return true;
        }
        if (startIndex == word.length()) {
            if (root.isTerminal) {
                return true;
            }
            return checkRemainingBranchesInTrie(root, "");
        }
        int index = word.charAt(startIndex) - 'a';
        TrieNode correspondingChild = root.children[index];
        if (correspondingChild == null) {
            if (root.isTerminal) {
                return checkWordForPalindrome(word.substring(startIndex));
            }
            return false;
        }
        return isDoesPairExist(correspondingChild, word, startIndex + 1);
    }

    private boolean checkRemainingBranchesInTrie(TrieNode root, String word) {
        if (root.isTerminal) {
            if (checkWordForPalindrome(word)) {
                return true;
            }
        }
        for (TrieNode childNode : root.children) {
            if (childNode == null) {
                continue;
            }
            String fwd = word + childNode.data;
            if (checkRemainingBranchesInTrie(childNode, fwd)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWordForPalindrome(String substring) {
        int start = 0;
        int end = substring.length() - 1;
        while (start < end) {
            if (substring.charAt(start) != substring.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //    autoCompleteSelf
    public void autoCompleteSelf(String word) {
        autoCompleteSelfHelper(root, word, "");
    }

    private void autoCompleteSelfHelper(TrieNode root, String word, String string) {
        if (root == null) {
            return;
        }
        if (word.isEmpty()) {
            printAutoCompleteSelf(root, string.substring(0, string.length() - 1));
            return;
        }
        int index = word.charAt(0) - 'a';
        TrieNode child = root.children[index];
        if (child != null) {
            autoCompleteSelfHelper(child, word.substring(1), string + word.charAt(0));
        }
    }

    private void printAutoCompleteSelf(TrieNode root, String string) {
        if (root == null) {
            return;
        }
        string = string + root.data;
        if (root.isTerminal) {
            System.out.println(string);
        }
        for (TrieNode child : root.children) {
            printAutoCompleteSelf(child, string);
        }
    }
    //    autoComplete
    public void autoComplete(ArrayList<String> input, String pattern) {
        for (String string : input) {
            add(string);
        }
        TrieNode node = findRoot(root,pattern);
        if(node==null||node.childCount==0){
            return;
        }
        String output = "";
        allRootToLeafPaths(node,output,pattern);
    }
    private TrieNode findRoot(TrieNode root, String pattern) {
        if (pattern.isEmpty()) {
            return root;
        }
        int childIndex = pattern.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return null;
        }
        return findRoot(child, pattern.substring(1));
    }

    private void allRootToLeafPaths(TrieNode node, String output, String pattern) {
        if (node.childCount == 0) {
            if (!output.isEmpty()) {
                System.out.println(pattern + output);
            }
            return;
        }
        if (node.isTerminal) {
            System.out.println(pattern + output);
        }
        for (int i = 0; i < node.children.length; i++) {
            if (node.children[i] != null) {
                String ans = output + node.children[i].data;
                allRootToLeafPaths(node.children[i], ans, pattern);
            }
        }
    }
}
